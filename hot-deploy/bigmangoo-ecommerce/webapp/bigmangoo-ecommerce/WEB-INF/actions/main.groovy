import javolution.util.FastList
import javolution.util.FastMap
import org.ofbiz.entity.util.EntityUtil
import org.ofbiz.product.catalog.CatalogWorker

//TODO 获得当前店铺关联的促销分类，根据促销分类查找促销显示促销图
webSite = CatalogWorker.getWebSite(request)
if(webSite.productStoreId){
    productStorePromoAndAppls = delegator.findByAndCache("ProductStorePromoAndAppl",[productStoreId:webSite.productStoreId], ["sequenceNum"])
}

//当前商店促销及促销图片
def promoAndPics = FastList.newInstance()
productStorePromoAndAppls.each{ productStorePromoAndAppl->
    productPromoContent = EntityUtil.getFirst(
            delegator.findByAndCache("ProductPromoContent",
                    [productPromoId:productStorePromoAndAppl.productPromoId,productPromoContentTypeId:"ORIGINAL_IMAGE_URL"]))
    if(productPromoContent){
        contentDataResourceView = EntityUtil.getFirst(
                delegator.findByAndCache("ContentDataResourceView",
                        [contentId:productPromoContent.contentId]))
        if(contentDataResourceView){
            def promoAndPic = FastMap.newInstance()
            promoAndPic.put("productPromoId",productStorePromoAndAppl.productPromoId)
            promoAndPic.put("promoName",productStorePromoAndAppl.promoName)
            promoAndPic.put("productPromoPic",contentDataResourceView.drObjectInfo)
            if(promoAndPics.size() == 0){
                promoAndPic.put("flag","active")
            }
            promoAndPics.add(promoAndPic)
        }
    }
}

context.promoAndPics = promoAndPics
