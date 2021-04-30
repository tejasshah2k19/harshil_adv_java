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
	<%
		UserBean user = (UserBean) request.getAttribute("user");

		String firstNameValue = null, emailValue = null;
		String firstNameError = (String) request.getAttribute("firstNameError");
		String emailError = (String) request.getAttribute("emailError");
		String passwordError = (String) request.getAttribute("passwordError");
		if (user != null) {
			firstNameValue = user.getFirstName();
			emailValue = user.getEmail();
		}
	%>


	<form action="RSignupController" method="get">
		FirstName: <input type="text" name="firstName"
			value="<%=firstNameValue != null ? firstNameValue : ""%>" />
		<%=firstNameError == null ? "" : firstNameError%>

		<br> Email :<input type="text" name="email" />
		<%
			if (emailError != null) {
		%>
		<%=emailError%>
		<%
			}
		%>
		<br> Password :<input type="password" name="password" />
		<%=passwordError == null ? "" : passwordError%>
	<br>
		<input type="submit" value="Signup" />
	</form>
	<br><br>
	<a href="RLogin.jsp">Login</a>
</body>
</html>