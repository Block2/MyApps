<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户登陆界面</title>
</head>
<body>
	<form action= "/TemperatureControlSystem/servlet/UserLoginServlet" method = "post">
	用户名称：<input type = "text" name = "username">${form.errorsMap.username }${message }<br/> 
	用户密码：<input type = "password" name = "password"><br/>
	<input type = "submit" value = "登陆">
	</form>
</body>
</html>