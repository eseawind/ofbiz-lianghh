<div class="row">

    ${(ProductsAndPriceList)!}

    <#list ProductsAndPriceList as ProductsAndPrice>
        <div class="col-xs-6 col-md-3">
            <a href="#" class="thumbnail">
                <img data-src="180x180" alt="${(ProductsAndPrice.productSmallImageUrl)!}">
            </a>
        </div>
    </#list>

</div>
