<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户注册界面</title>
<script type="text/javascript">
	/*
	*	防止表单重复提交	
	*/
	var isCommited = false;
	function doSubmit() {
		if(!isCommited){
			isCommited = true;
		}
		return isCommited;
	}
</script>
</head>
<body>
	<form action= "/TemperatureControlSystem/servlet/UserRegister" method = "post">
	<input type="hidden" name = "token" value = "${token }">
	用户名称：<input type = "text" name = "username">${form.errorsMap.username }${message }<br/> 
	用户密码：<input type = "password" name = "password">${form.errorsMap.password }<br/>
	确认密码：<input type = "password" name = "confirmPassword">${form.errorsMap.confirmPassword }<br/>
	电子邮件：<input type = "text" name = "email"><br/>
	所在城市：<input type = "text" name = "city"><br/>
	用户地址：<input type = "text" name = "address"><br/>
              用户电话：<input type = "text" name = "telephone"><br/>
 	用户标识：<select name = "flag" >
 	<option value="0">管理员</option>
 	<option value="1" selected="selected">普通用户</option>
 	</select><br/>
 	用户描述：<textarea rows = "2" cols ="25" name = "userdesc"></textarea><br/>
	<input type = "submit" value = "注册">
	</form>
</body>
</html>