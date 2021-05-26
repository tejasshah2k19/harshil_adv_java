<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  session="false"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.myerror {
	color: red;
}
</style>
</head>
<body>
	<h2>Login</h2>

	<a href="ListAllUsersController">List ALL Users</a>
	<br>
	<br>


	<form action="RLoginController" method="post">
		Email: <input type="text" name="email" /><br> Password: <input
			type="password" name="password" /><br> <br> <input
			type="submit" value="Login" />

	</form>
	<br>

	<span class="myerror">${error}</span>
</body>
</html>