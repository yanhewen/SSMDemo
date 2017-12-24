<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>首页</title>
</head>

<style>
    div {
        width: 70%;
        height: 80%;
    }
    img {
        width: 100%;
        height: 100%;
    }
</style>
<body>
<h1 align="center">
    欢迎进入interview测试页面
</h1>

<h2>一、保存人员：POST请求，提交JSON格式数据</h2>
<div>
    <img src="img/addUser.png" alt="新增人员">
</div>

<h2>二、查询ID=1的用户信息</h2>
<div>
    <img src="img/find.png" alt="查询人员">
</div>

<h2>三、禁用ID=6的人员</h2>
<div>
    <img src="img/disableOne.png" alt="禁用人员">
</div>

<h2>四、查询所有人员</h2>
<div>
    <img src="img/findAll.png" alt="查询所有人员">
</div>
</body>
</html>
