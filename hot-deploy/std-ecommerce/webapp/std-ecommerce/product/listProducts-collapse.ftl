<div class="btn-group-vertical" style="width: 100%">
    <#list productCategoryList as productCategory>
        <button type="button" class="btn btn-default">${(productCategory.description)!}</button>
    </#list>
</div>