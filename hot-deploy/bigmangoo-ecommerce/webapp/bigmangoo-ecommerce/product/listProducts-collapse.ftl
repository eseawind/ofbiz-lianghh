<div class="btn-group-vertical" style="width: 100%">
    <#if productCategoryList?has_content>
        <#list productCategoryList as productCategory>
            <a href="<@ofbizUrl>listProducts?productCategoryId=${(productCategory.productCategoryId)!}</@ofbizUrl>" type="button" class="btn btn-default">${(productCategory.description)!}</a>
        </#list>
    <#else>
        当前没有目录
    </#if>
</div>
