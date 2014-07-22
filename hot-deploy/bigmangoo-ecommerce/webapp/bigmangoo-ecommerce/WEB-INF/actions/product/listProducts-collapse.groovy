import javolution.util.FastList
import org.ofbiz.product.catalog.*

def module = "listProducts-collapse.groovy"

//获得当前商品的目录ID
catalogId = CatalogWorker.getCurrentCatalogId(request)

prodCatalogCategorys = EntityUtil.filterByDate(delegator.findByAndCache("ProdCatalogCategory",[prodCatalogId:catalogId]))
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
