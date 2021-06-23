<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<form action="JstlCalcOutput.jsp">

		No.1 : <input type="text" name="n1" /> ${n1Error } <br> No.2 : <input
			type="text" name="n2" />${n2Error } <br> Add : <input
			type="radio" name="opr" value="1" /><br> Sub : <input
			type="radio" name="opr" value="2" /><br> Mul : <input
			type="radio" name="opr" value="3" /><br> Div : <input
			type="radio" name="opr" value="4" /><br> ${oprError } <br>
		<input type="submit" value="Add" />
	</form>

	<br>

	<c:remove var="n1Error" scope="session"/>
</body>
</html>