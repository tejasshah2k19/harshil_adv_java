<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<jsp:useBean id="user" scope="session" class="com.bean.UserBean"></jsp:useBean>
	<jsp:setProperty property="firstName" name="user" param="firstName"/>
	<jsp:setProperty property="email" name="user"/>
	<jsp:setProperty property="password" name="user"/>
	
	User Info <br>
	FirstName :  <jsp:getProperty property="firstName" name="user"/> <br>
	Email :	<jsp:getProperty property="email" name="user"/><br>
	Password : <jsp:getProperty property="password" name="user"/><br>
	

	<a href="SaveBeanToUserController">Save Bean</a>


</body>
</html>