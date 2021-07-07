<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="ctag" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<c:greet />
	<br> Hi....
	<br> INR -> USD :
	<c:curr amount="1500" type="usd"></c:curr>
	<br> INR -> AUD :
	<c:curr amount="1500" type="aud"></c:curr>
	<br> INR :
	<c:curr amount="1500" type="sd"></c:curr>
	<br><br>
	<c:print count="5">Royal<br></c:print>


</body>
</html>