<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false" buffer="8kb" autoFlush="true"
	import="java.util.Scanner,java.sql.Date" import="java.applet.Applet"%>
<%@ page import="java.io.File"   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Scanner scr = null;
		Date d = null;
		String firstNameError = (String) request.getAttribute("firstNameError");
		String emailError = (String) request.getAttribute("emailError");
		String passwordError = (String) request.getAttribute("passwordError");
		String firstNameValue = (String) request.getAttribute("firstNameValue");
		String emailValue = (String) request.getAttribute("emailValue");
		String genderError = (String) request.getAttribute("genderError");
		String genderValue = (String) request.getAttribute("genderValue");
		String cityValue = (String) request.getAttribute("cityValue");
	%>


	<form action="SignupController" method="get">
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
		<br> Gender : Male:<input type="radio" name="gender" value="male"
			<%=genderValue != null && genderValue.equals("male") ? "checked" : ""%> />
		Female:<input type="radio" name="gender" value="female"
			<%=genderValue != null && genderValue.equals("female") ? "checked" : ""%> />





		<%=genderError == null ? "" : genderError%>



		<br> City : <select name="city">

			<option value="-1">---Select City---</option>
			<option value="ahmedabad"
				<%=cityValue != null && cityValue.equals("ahmedabad") ? "selected" : ""%>>Ahmedabad</option>
			<option value="baroda">Baroda</option>
			<option value="surat">Surat</option>

		</select> ${cityError} <br> Hobby : Facebook: <input type="checkbox"
			name="hobby" value="fb"><br> Cricket: <input
			type="checkbox" name="hobby" value="ckt"><br> FootBall :
		<input type="checkbox" name="hobby" value="football"><br>
		<input type="submit" value="Signup" />
	</form>

</body>
</html>