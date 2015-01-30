<%--
  User: jiangyukun
  Date: 2014/11/23 19:04
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html ng-app="login" ng-cloak>
<head>
    <title>用户登录</title>
</head>
<body>
<div ng-controller="loginController" class="center">
    <h1>登录</h1>

    <div class="row">
        <div class="input-group">
            <label class="input-group-addon" for="mobile">手机号</label>
            <input class="form-control" id="mobile" type="text" name="mobile" ng-blur="blur();" ng-model="mobile"/>
            <span class="input-group-addon" ng-class="">{{message}}</span>
        </div>
    </div>
    <div class="gap"></div>
    <div class="row">
        <div class="input-group">
            <label class="input-group-addon" for="password">密码</label>
            <input class="form-control" id="password" type="password" name="password" ng-model="password"/>
        </div>
    </div>
    <div class="gap"></div>
    <div class="row">
        <div class="alert alert-danger" ng-hide="loginInfo();">{{loginResult}}</div>
    </div>
    <div class="input-group">
        <button class="btn btn-default" ng-click="submit();" ng-disabled="btnState();">提交</button>
        <a href="../user/register">点击注册</a>
    </div>
</div>
<script src="resource/angularjs/controller/login.js"></script>
</body>
</html>