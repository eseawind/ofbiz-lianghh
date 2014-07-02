import org.ofbiz.base.util.Debug
import org.ofbiz.entity.util.EntityUtil
import javolution.util.FastList
import javolution.util.FastMap

prodCatalogCategorys = EntityUtil.filterByDate(delegator.findByAnd("ProdCatalogCategory",[prodCatalogId:"STDCatalog",prodCatalogCategoryTypeId:"PCCT_BROWSE_ROOT"]))
prodCatalogCategory = EntityUtil.getFirst(prodCatalogCategorys)

/**
 * 通过闭包迭代取得所有分类以及下属分类
 */
getAllSubProductCategory = { parentProductCategoryId,productCategoryList ->
    productCategoryRollups = EntityUtil.filterByDate(delegator.findByAnd("ProductCategoryRollup",[parentProductCategoryId:parentProductCategoryId]))
    productCategoryRollups.each{ productCategoryRollup ->
        productCategory = delegator.findOne("ProductCategory",[productCategoryId:productCategoryRollup.productCategoryId],false)
        productCategoryList.add(productCategory)
//        subProductCategoryList = FastList.newInstance()
//        productCategory.put("productCategoryList",subProductCategoryList)
//        getAllSubProductCategory(productCategoryRollup.productCategoryId,subProductCategoryList)
    }
}

productCategoryList = FastList.newInstance()
if(prodCatalogCategory){
    getAllSubProductCategory(prodCatalogCategory.productCategoryId,productCategoryList)
}
context.productCategoryList = productCategoryList
