<%--
  User: jiangyukun
  Date: 2015/1/29 16:32
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
    <base href="/">
    <title><tiles:getAsString name="title"/></title>
    <link href="static/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <link href="static/css/app.css" rel="stylesheet" type="text/css"/>
    <script src="resource/util/md5.js"></script>
    <script src="static/js/jquery-2.1.1.js"></script>
    <script src="static/js/angular.js"></script>
    <script src="static/js/angular-route.js"></script>
</head>
<body>
<div class="header">
    <tiles:insertAttribute name="header"/>
</div>
<div class="menu">
    <tiles:insertAttribute name="menu"/>
</div>
<div class="body">
    <tiles:insertAttribute name="body"/>
</div>
<div class="copyright">
    <tiles:insertAttribute name="footer"/>
</div>
</body>
</html>