import org.ofbiz.entity.util.EntityUtil
import javolution.util.FastList

prodCatalogCategorys = EntityUtil.filterByDate(delegator.findByAndCache("ProdCatalogCategory",[prodCatalogId:"STDCatalog",prodCatalogCategoryTypeId:"PCCT_BROWSE_ROOT"]))
prodCatalogCategory = EntityUtil.getFirst(prodCatalogCategorys)

productCategoryList = FastList.newInstance()
if(prodCatalogCategory){
    productCategoryRollups = EntityUtil.filterByDate(delegator.findByAndCache("ProductCategoryRollup",[parentProductCategoryId:prodCatalogCategory.productCategoryId]))
    productCategoryRollups.each{ productCategoryRollup ->
        productCategory = delegator.findOne("ProductCategory",[productCategoryId:productCategoryRollup.productCategoryId],true)
        productCategoryList.add(productCategory)
        //TODO 添加当前分类下的子分类,暂时做两级目录结构
    }
}
context.productCategoryList = productCategoryList
