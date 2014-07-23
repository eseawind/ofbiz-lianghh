<#if promoAndPics?has_content>

    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <#list promoAndPics as promoAndPic>
                <li data-target="#carousel-example-generic" data-slide-to="0" class="${(promoAndPic.flag)!}"></li>
            </#list>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
            <#list promoAndPics as promoAndPic>
                <div class="item ${(promoAndPic.flag)!}">
                    <img class="container" src="${(promoAndPic.productPromoPic)!}" alt="">
                    <div class="carousel-caption">
                        <h3>${(promoAndPic.promoName)!}</h3>
                    </div>
                </div>
            </#list>
        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>

<#else>
    当前店铺下没有促销
</#if>
