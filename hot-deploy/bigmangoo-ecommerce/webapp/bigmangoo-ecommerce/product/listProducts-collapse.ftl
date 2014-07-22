<div class="btn-group-vertical" style="width: 100%">
    <#list productCategoryList as productCategory>
        <a href="<@ofbizUrl>listProducts?productCategoryId=${(productCategory.productCategoryId)!}</@ofbizUrl>" type="button" class="btn btn-default">${(productCategory.description)!}</a>
    </#list>
</div>
