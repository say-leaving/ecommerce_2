<%--
  Created by IntelliJ IDEA.
  User: say
  Date: 2018/4/22
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">
    <title>m2b2c单点登录</title>

    <!-- Bootstrap core CSS -->

    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/css/signin.css" rel="stylesheet" >
    <link href="../css/head.css" rel="stylesheet" >

    <script>
        function registUI() {
            window.location="${pageContext.request.contextPath}/user/register.jsp";
        }
    </script>
</head>

<body class="body-back">
<nav class="top"></nav>
<div class="container " >
    <div class="login-head" >
        <form class="form-signin" action="/user/checkLogin"  method="post" >
            <h4 class="form-signin-heading" align="center">登录</h4>
            <input type="text" id="username" class="form-control" name="username"  placeholder="用户名:" required autofocus>
            <input type="password" id="password" class="form-control" name="password" placeholder="密码：" required>
            <div class="checkbox">
                <label>
                    <input type="checkbox" value="remember-me"> 记住我
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit" onclick="loginOn()">登录</button>
            <input type="text" class="btn btn-lg btn-primary btn-block" value="注册" onclick="registUI()"/>
        </form>
    </div>

</div> <!-- /container -->
<script>
    function loginOn() {
        var name =$("#username");
        var password =$("#password");
        var data = {"username":name,"password":password};
        $.ajax({
            url:"/user/login",
            type:"post",
            data:"json",
            dataType:"json",
            success:function (data) {

            }
        })
    }
</script>
</body>
</html>
