import org.ofbiz.entity.util.EntityUtil
import javolution.util.FastList
import sun.security.util.Debug

productCategoryId = parameters.productCategoryId

//TODO 暂时默认显示武装战线系列的服装
if(!productCategoryId){
    productCategoryId = "WZZX"
}

//TODO 建立分页
productCategoryMemberAndPrices = EntityUtil.filterByDate(delegator.findByAndCache("ProductCategoryMemberAndPrice",[productCategoryId:productCategoryId,priceProductPriceTypeId:"DEFAULT_PRICE"]))
context.ProductsAndPriceList = productCategoryMemberAndPrices
