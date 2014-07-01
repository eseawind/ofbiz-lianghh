<div class="panel-group well" id="accordion">

    <#list productCategoryList as productCategory>

        <div class="panel panel-default">
            <div class="panel-heading">
                <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
                    <h4 class="panel-title">
                        ${(productCategory.description)!}
                    </h4>
                </a>
            </div>
            <div id="collapseOne" class="panel-collapse collapse in">
                <div class="panel-body">
                    子分类
                </div>
            </div>
        </div>

    </#list>

</div>
