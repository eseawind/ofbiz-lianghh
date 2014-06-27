<nav class="navbar navbar-default" role="navigation">

    <div class="container">

        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="<@ofbizUrl>main</@ofbizUrl>">项目名称</a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="杜雷斯">
                </div>
                <button type="submit" class="btn btn-default">搜索</button>
            </form>

            <ul class="nav navbar-nav">
                <li class="active">
                    <a href="<@ofbizUrl>listProducts</@ofbizUrl>">首页
                    </a>
                </li>
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <#if sessionAttributes.autoName?has_content>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            ${sessionAttributes.autoName?html}
                                <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href="#">我的账户</a></li>
                            <li class="divider"></li>
                            <li><a href="#">我的订单</a></li>
                            <li class="divider"></li>
                            <li><a href="#">我的收藏</a></li>
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