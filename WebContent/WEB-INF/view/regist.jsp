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
	<script src="static/js/jquery-1.12.4.min.js"></script>
	<script src="static/js/jquery.validate.min.js"></script>
	<script src="static/js/messages_zh.min.js"></script>
	
	<!-- 
		$(function(){
			$("#formId").validate(
				
			});
	 -->
	
	<script type="text/javascript">
		/* $(function(){
			alert("111");
		}); */
		window.onload = function(){
			alert("111");
			alert($("#password").val());
		}
	</script>
<body>
	<h1>进行注册</h1>
	<form action="user/user_regist">
		<label>输入帐号:</label>
			<input name="u.username" type="text">
		<br>
		<label>输入密码:</label>
			<input name="u.password" id="password" type="password">
		<br>
		<label>再次输入密码:</label>
			<input id="regPassword" type="password">
		<br>
		<p>${message }</p>
		<input type="submit" value="注册"><br><br><br>
		<a href="user/user_loginIndex">跳转登录</a>
	</form>
</body>
</html>