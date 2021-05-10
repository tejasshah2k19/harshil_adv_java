<%@page import="com.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="RSignupController" method="post">
		FirstName: <input type="text" name="firstName"
			value="${user.firstName}" /> ${firstNameError} <br> Email :<input
			type="text" name="email" value="${user.email}" /> ${emailError } <br> Password :<input
			type="password" name="password" /> ${passwordError } <br> <input
			type="submit" value="Signup" />
	</form>
	<br>
	<br>
	<a href="RLogin.jsp">Login</a>
</body>
</html>