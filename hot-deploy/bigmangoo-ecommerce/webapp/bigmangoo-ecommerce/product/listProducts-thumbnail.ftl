<div class="row">

    <#list ProductsAndPriceList as ProductsAndPrice>
        <div class="col-xs-6 col-md-3 well-bg">
            <a href="<@ofbizUrl>productDetail?productId=${(ProductsAndPrice.productId)!}" target="_Blank"</@ofbizUrl>" class="thumbnail">
                <img src="${(ProductsAndPrice.productSmallImageUrl)!}">
            </a>
            ${(ProductsAndPrice.productInternalName)!}<br>
            $${(ProductsAndPrice.pricePrice)!}<br>
        </div>

    </#list>

</div>
