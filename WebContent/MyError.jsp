<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"  isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

Something went wrong...
<br><br>    




<%=exception %>

<br><br>
<%=exception.getMessage() %>

<br><br>
<hr>

<%=exception.getClass() %>
<%if(exception.getClass().toString().equals("class java.lang.NumberFormatException")){ %>

<h2>Please Enter Only Integers</h2>
<%}else if(exception.getClass().toString().equals("class java.lang.ArithmeticException")){ %>
	<h2>Please Do not enter zero in second number</h2>
<%} %>



</body>
</html>