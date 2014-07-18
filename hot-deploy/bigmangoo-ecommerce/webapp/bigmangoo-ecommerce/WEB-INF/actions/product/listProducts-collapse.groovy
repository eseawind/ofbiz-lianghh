import org.ofbiz.entity.util.EntityUtil
import javolution.util.FastList

prodCatalogCategorys = EntityUtil.filterByDate(delegator.findByAndCache("ProdCatalogCategory",[prodCatalogId:"STDCatalog",prodCatalogCategoryTypeId:"PCCT_BROWSE_ROOT"]))
prodCatalogCategory = EntityUtil.getFirst(prodCatalogCategorys)

/**
 * 通过闭包迭代取得所有分类以及下属分类
 */
getAllSubProductCategory = { parentProductCategoryId,productCategoryList ->
    productCategoryRollups = EntityUtil.filterByDate(delegator.findByAndCache("ProductCategoryRollup",[parentProductCategoryId:parentProductCategoryId]))
    productCategoryRollups.each{ productCategoryRollup ->
        productCategory = delegator.findOne("ProductCategory",[productCategoryId:productCategoryRollup.productCategoryId],true)
        productCategoryList.add(productCategory)
    }
}

productCategoryList = FastList.newInstance()
if(prodCatalogCategory){
    getAllSubProductCategory(prodCatalogCategory.productCategoryId,productCategoryList)
}
context.productCategoryList = productCategoryList
