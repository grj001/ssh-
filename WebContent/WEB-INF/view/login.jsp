<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=basePath%>">
</head>
<body>
	<h1>进行登录</h1>
	<form action="user/user_login">
		<input name="u.username" type="text">
		<input name="u.password" type="password"> 
		<p>${message }</p>
		<input type="submit" value="登录"><br><br><br>
		
		
		<a href="user/user_registIndex">跳转注册</a>
	</form>
</body>
</html>