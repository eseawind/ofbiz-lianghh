
<div class="container" style="max-width: 330px;">

    <div class="well">

        <ul class="nav nav-pills nav-justified" role="tablist" id="loginTab">
            <li class="active"><a href="#login" role="tab" data-toggle="tab">登陆</a></li>
            <li><a href="#register" role="tab" data-toggle="tab">注册</a></li>
        </ul>
        <br>

        <div class="tab-content">
            <div class="tab-pane active" id="login">

                <form class="form-signin" role="form" action="<@ofbizUrl>login</@ofbizUrl>">
                    <input id="userName" name="USERNAME" type="email" class="form-control" placeholder="Email address" required="" autofocus="">
                    <br>
                    <input id="password" name="PASSWORD" type="password" class="form-control" placeholder="Password" required="">
                    <label class="checkbox">
                        <input type="checkbox" value="remember-me"> 记住我
                    </label>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
                </form>

            </div>
            <div class="tab-pane" id="register">
                这是注册页面
            </div>
        </div>

    </div>

</div>

<script>
    $(function () {
        $('#loginTab a:last').tab('show')
    })
</script>