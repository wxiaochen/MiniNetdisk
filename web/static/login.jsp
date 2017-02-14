<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<html>
<head>
	<title>登录</title>

	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<link rel="stylesheet" href="/static/css/bootstrap.min.css">
</head>
<body>
<div class="container" style="width:400px; margin-top:180px;">
	<p style="color:#46A3FF; font-size:27px; margin-left:46px; margin-bottom:30px;">Mini云盘登录</p>

	<form method="post" action="${ctx }/loginuser/login">
		<div class="input-group " style="margin-bottom:20px;">
			<span class="input-group-addon" style="width:50px;">帐号</span>
			<input type="text" name="username" class="form-control" placeholder="邮箱或用户名" style="width:213px">
		</div>

		<div class="input-group" style="margin-bottom:20px">
			<span class="input-group-addon" style="width:50px;">密码</span>
			<input type="text" name="password" class="form-control" style="width:213px" placeholder="请输入您的密码">
		</div>
		<div class="input-group" style="margin-bottom:20px;">
			<input type="submit" class="btn btn-info" style="width:95px;background:#46A3FF; color:white;" value="登录" >
			<a href="/static/regist.jsp" style="text-decoration:none;font-size:20px; margin-left:90px;">点我注册</a>
		</div>
	</form>
</div>
</body>
</html>