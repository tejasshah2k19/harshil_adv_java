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
		String firstNameError = (String) request.getAttribute("firstNameError");
		String emailError = (String) request.getAttribute("emailError");
		String passwordError = (String) request.getAttribute("passwordError");
		String firstNameValue = (String) request.getAttribute("firstNameValue");
		String emailValue = (String) request.getAttribute("emailValue");
	%>


	<form action="SignupController">
		FirstName: <input type="text" name="firstName" value="<%=firstNameValue!=null?firstNameValue:""%>"/>
		<%=firstNameError == null ? "" : firstNameError%>

		<br> Email :<input type="text" name="email"/>
		<%
			if (emailError != null) {
		%>
		<%=emailError%>
		<%
			}
		%>
		<br> Password :<input type="password" name="password" />
		<%=passwordError == null ? "" : passwordError%>
		<br> Gender : Male:<input type="radio" name="gender" value="male" />
		Female:<input type="radio" name="gender" value="female" /><br>
		City : <select name="city">
			<option value="ahmedabad">Ahmedabad</option>
			<option value="baroda">Baroda</option>
			<option value="surat">Surat</option>

		</select> <br> Hobby : Facebook: <input type="checkbox" name="hobby"
			value="fb"><br> Cricket: <input type="checkbox"
			name="hobby" value="ckt"><br> FootBall : <input
			type="checkbox" name="hobby" value="football"><br> <input
			type="submit" value="Signup" />
	</form>

</body>
</html>