<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>大芒果</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="<@ofbizContentUrl>/images/bootstrap/css/bootstrap.min.css</@ofbizContentUrl>">

    <!-- 全局CSS样式 -->
    <link href="/bigmangoo/images/css/stylish-portfolio.css" rel="stylesheet">
    <link href="/bigmangoo/images/font-awesome/css/font-awesome.min.css" rel="stylesheet">

</head>

<body>

<!-- Side Menu -->
<a id="menu-toggle" href="#" class="btn btn-primary btn-lg toggle"><i class="fa fa-bars"></i></a>
<div id="sidebar-wrapper">
    <ul class="sidebar-nav">
        <a id="menu-close" href="#" class="btn btn-default btn-lg pull-right toggle"><i class="fa fa-times"></i></a>
        <li class="sidebar-brand"><a href="#">大芒果</a>
        </li>
        <li><a href="#top">首页</a>
        </li>
        <li><a href="#about">案例</a>
        </li>
        <li><a href="#services">服务</a>
        </li>
        <li><a href="#portfolio">团队</a>
        </li>
        <li><a href="#contact">联系我们</a>
        </li>
    </ul>
</div>
<!-- /Side Menu -->

<!-- Full Page Image Header Area -->
<div id="top" class="header">
    <div class="vert-text">
        <h1>大芒果 工作室</h1>
        <h3>
            we design software awesome
        </h3>
    </div>
</div>
<!-- /Full Page Image Header Area -->

<!-- Intro -->
<div id="about" class="intro">
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3 text-center">
                <h2>我们的工作是</h2>
                <p class="lead">让客户的工作更轻松<br><a target="_blank" href="#">(查看案例)</a></p>
            </div>
        </div>
    </div>
</div>
<!-- /Intro -->

<!-- Services -->
<div id="services" class="services">
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4 text-center">
                <h2>我们的服务</h2>
                <hr>
            </div>
        </div>
        <div class="row">
            <div class="col-md-2 col-md-offset-2 text-center">
                <div class="service-item">
                    <i class="service-icon fa fa-rocket"></i>
                    <h4>高速访问</h4>
                    <p>独立主机<br>访问速度无懈可击</p>
                </div>
            </div>
            <div class="col-md-2 text-center">
                <div class="service-item">
                    <i class="service-icon fa fa-magnet"></i>
                    <h4>网络推广</h4>
                    <p>专业网络推广服务</p>
                </div>
            </div>
            <div class="col-md-2 text-center">
                <div class="service-item">
                    <i class="service-icon fa fa-shield"></i>
                    <h4>日常运维</h4>
                    <p>全托管式管理<br>客户无后顾之忧</p>
                </div>
            </div>
            <div class="col-md-2 text-center">
                <div class="service-item">
                    <i class="service-icon fa fa-pencil"></i>
                    <h4>个性设计</h4>
                    <p>提供软件的个性化设计</p>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- /Services -->

<!-- Callout -->
<div class="callout">
    <div class="vert-text">
        <h1>MAKE YOUR WORK SIMPLE</h1>
    </div>
</div>
<!-- /Callout -->

<!-- Portfolio -->
<div id="portfolio" class="portfolio">
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4 text-center">
                <h2>团队成员</h2>
                <hr>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4 col-md-offset-2 text-center">
                <div class="portfolio-item">
                    <a href="#">
                        <img class="img-portfolio img-responsive img-circle" src="/bigmangoo/images/images/portfolio-1.jpg">
                    </a>
                    <h4>Toby</h4>
                </div>
            </div>
        </div>

    </div>
</div>
<!-- /Portfolio -->

<!-- Call to Action -->
<div class="call-to-action">
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3 text-center">
                <h3>联系我们</h3><br>
                <h5>电子邮箱</h5>nggliang@gmail.com
            </div>
        </div>
    </div>
</div>
<!-- /Call to Action -->

<!-- Map -->
<div id="contact" class="container">

</div>
<!-- /Map -->

<!-- Footer -->
<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3 text-center">
                <div class="top-scroll">
                    <a href="#top"><i class="fa fa-circle-arrow-up scroll fa-4x"></i></a>
                </div>
                <hr>
                <p>Copyright &copy; 大芒果工作室 2014</p>
            </div>
        </div>
    </div>
</footer>
<!-- /Footer -->

<!-- JavaScript -->
<script src="<@ofbizContentUrl>/images/jquery/jquery-1.7.min.js</@ofbizContentUrl>"></script>
<script src="<@ofbizContentUrl>/images/bootstrap/js/bootstrap.min.js</@ofbizContentUrl>"></script>

<!-- Custom JavaScript for the Side Menu and Smooth Scrolling -->
<script>
    $("#menu-close").click(function(e) {
        e.preventDefault();
        $("#sidebar-wrapper").toggleClass("active");
    });
</script>
<script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#sidebar-wrapper").toggleClass("active");
    });
</script>
<script>
    $(function() {
        $('a[href*=#]:not([href=#])').click(function() {
            if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') || location.hostname == this.hostname) {

                var target = $(this.hash);
                target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
                if (target.length) {
                    $('html,body').animate({
                        scrollTop: target.offset().top
                    }, 1000);
                    return false;
                }
            }
        });
    });
</script>

</body>

</html>
