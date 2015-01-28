<%--
  User: jiangyukun
  Date: 2014/11/23 19:04
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html ng-app="login" ng-cloak>
<head>
    <base href="/">
    <title>登陆</title>
    <link href="static/css/app.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div ng-controller="loginController" class="center">
    <h1>登录</h1>

    <div class="warning">${info}</div>
    <form action="userLogin" method="post">
        <div class="input_line">
            <label for="mobile">手机号</label>
            <input id="mobile" type="text" name="mobile" ng-blur="blur();" ng-model="mobile"/>
            <span class="info">{{message}}</span>
        </div>
        <div class="input_line">
            <label for="password">密码</label>
            <input id="password" type="password" name="password"/>
        </div>
        <div>
            <a href="../user/register">点击注册</a>
            <input type="submit" value="提交" ng-disabled="btnState();"/>
        </div>
    </form>
</div>

<script src="static/js/angular.js"></script>
<script src="static/js/angular-route.js"></script>
<script src="resource/angularjs/controller/login.js"></script>
</body>
</html>
