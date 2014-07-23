<div class="row">

    <#if ProductsAndPriceList?has_content>
        <#list ProductsAndPriceList as ProductsAndPrice>
            <div class="col-xs-6 col-md-3 well-bg">
            <a href="<@ofbizUrl>productDetail?productId=${(ProductsAndPrice.productId)!}" target="_Blank"</@ofbizUrl>" class="thumbnail">
                <img src="${(ProductsAndPrice.productSmallImageUrl)!}">
                </a>
            ${(ProductsAndPrice.productInternalName)!}<br>
                $${(ProductsAndPrice.pricePrice)!}<br>
            </div>
        </#list>
    <#else>
        当前分类下无产品
    </#if>

</div>
