<!DOCTYPE html>
<html lang="en">
<head>
<#if layoutSettings.javaScripts?has_content>
    <#list layoutSettings.javaScripts as javaScript>
        <script language="javascript" src="<@ofbizContentUrl>${javaScript}</@ofbizContentUrl>" type="text/javascript"></script>
    </#list>
</#if>
</head>
<body>

<div class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <a href="javascript:;" class="navbar-brand">大芒果 管理系统</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="javascript:;">店铺管理</a></li>
                <li><a href="javascript:;">产品管理</a></li>
                <li><a href="javascript:;">会员管理</a></li>
                <li><a href="javascript:;">订单管理</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">梁徽徽<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="javascript:;">个人中心</a></li>
                        <li class="divider"></li>
                        <li><a href="javascript:;">退出</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>
