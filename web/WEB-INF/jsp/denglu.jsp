<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <title>登录</title>
    <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.1.0/css/font-awesome.min.css">
    <link rel='stylesheet' href='../../ui/bootstrap_css/jquery-ui.css'>
    <link rel='stylesheet prefetch' href='../../ui/bootstrap_css/bootstrap.min.css'>

    <link rel="stylesheet" href="../../ui/bootstrap_css/style.css" media="screen" type="text/css" />

    <script src="../../ui/bootstrap_js/modernizr.js"></script>
    <script src="../../ui/jquery.min.js"></script>

</head>

<body class="login-page">
<div style="text-align: center;font-family: 微软雅黑;font-size: 25px;" >物资管理系统</div>
<div class="login-form">

    <div class="login-content">


        <form action="/user/denglu" method="post" role="form" id="login_fm">

            <div class="form-group">

                <div class="input-group">
                    <div class="input-group-addon">
                        <i class="fa fa-user"></i>
                    </div>

                    <input type="text" class="form-control" name="username" id="username" placeholder="用户名" autocomplete="off" />
                </div>

            </div>

            <div class="form-group">

                <div class="input-group">
                    <div class="input-group-addon">
                        <i class="fa fa-key"></i>
                    </div>

                    <input type="password" class="form-control" name="password" id="password" placeholder="密码" autocomplete="off" />
                </div>

            </div>

            <%--<div class="form-group">--%>
                <%--<button type="submit" class="btn btn-primary btn-block btn-login">--%>
                    <%--<i class="fa fa-sign-in"></i>--%>
                    <%--登  录--%>
                <%--</button>--%>
            <%--</div>--%>

            <div class="form-group">
                <button type="submit" class="btn btn-primary btn-block btn-login">
                    <%--<i class="fa fa-sign-in"></i>--%>
                    登  录
                </button>
            </div>

        </form>

        <div style="text-align:center;clear:both;">
            <script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
            <script src="/follow.js" type="text/javascript"></script>
        </div>

    </div>

</div>
</div>

</body>

</html>