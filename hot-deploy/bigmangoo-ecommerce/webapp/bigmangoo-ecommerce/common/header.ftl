<nav class="navbar navbar-default" role="navigation">

    <div class="container">

        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<@ofbizUrl>main</@ofbizUrl>">大芒果网</a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

            <form class="navbar-form navbar-left" role="search" action="<@ofbizUrl>listProducts</@ofbizUrl>">
                <div class="form-group">
                    <input id="searchWord" name="SEARCHWORD" type="text" class="form-control" placeholder="输入产品名称">
                </div>
                <button type="submit" class="btn btn-default">搜索</button>
            </form>

            <ul class="nav navbar-nav navbar-right">
                <#if sessionAttributes.autoName?has_content>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            ${sessionAttributes.autoName?html}
                                <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="divider"></li>
                            <li><a href="<@ofbizUrl>autoLogout</@ofbizUrl>">退出</a></li>
                        </ul>
                    </li>
                <#else>
                    <li>
                        <a href="<@ofbizUrl>login</@ofbizUrl>">请登录
                        </a>
                    </li>
                </#if>
            </ul>
        </div>

    </div>
</nav>