<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%@include file="Header.jsp" %>


	<form action="DbUpdateStudentController" method="post">
	<input type="hidden" name="studentId" value="${sb.studentId}"/>

		FirstName: <input type="text" name="firstName"   value="${sb.firstName}" /> ${firstNameError }
		<br> Email :<input type="text" name="email" value="${sb.email }" /> ${emailError } <br>
		<br> <input type="submit" value="Update" />
	</form>


</body>
</html>