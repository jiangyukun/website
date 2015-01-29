<%--
  User: jiangyukun
  Date: 2014/11/23 19:04
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html ng-app="login" ng-cloak>
<head>
    <title>login</title>
</head>
<body>
<div ng-controller="loginController" class="center">
    <h1>登录</h1>

    <div class="input_line">
        <label for="mobile">手机号</label>
        <input id="mobile" type="text" name="mobile" ng-blur="blur();" ng-model="mobile"/>
        <span class="info" ng-class="">{{message}}</span>
    </div>
    <div class="input_line">
        <label for="password">密码</label>
        <input id="password" type="password" name="password" ng-model="password"/>
    </div>
    <div class="info">{{loginResult}}</div>
    <div>
        <a href="../user/register">点击注册</a>
        <button ng-click="submit();" ng-disabled="btnState();">提交</button>
    </div>
</div>
<script src="resource/angularjs/controller/login.js"></script>
</body>
</html>