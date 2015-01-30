<%--
  User: jiangyukun
  Date: 2014/11/23 11:21
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<div class="center">
    <h2>注册</h2>
    <form action="/user/addUser" method="post">
        <div class="input_line">
            <label for="username">用户名</label>
            <input id="username" type="text" name="username"/>
        </div>
        <div class="input_line">
            <label for="password">密码</label>
            <input id='password' type="password" name="password"/>
        </div>
        <div class="input_line">
            <label for="email">电子邮件</label>
            <input id="email" type="email" name="email"/>
        </div>
        <div class="input_line">
            <label for="mobile">手机号</label>
            <input id="mobile" type="text" name="mobile"/>
        </div>
        <div>
            <input type="submit" value="提交"/>
        </div>
    </form>
</div>
</body>
</html>
