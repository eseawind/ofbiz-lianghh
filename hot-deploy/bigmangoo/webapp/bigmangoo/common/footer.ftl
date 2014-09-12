<#if layoutSettings.styleSheets?has_content>
    <#list layoutSettings.styleSheets as styleSheet>
    <link rel="stylesheet" href="<@ofbizContentUrl>${styleSheet}</@ofbizContentUrl>" type="text/css"/>
    </#list>
</#if>
</body>
</html>