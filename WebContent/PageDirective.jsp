<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Scanner,java.io.File"
	import="java.applet.Applet"%>

<%@page import="java.lang.Math" autoFlush="true" buffer="8kb"
	session="true" isELIgnored="false"  errorPage="MyError.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>${cookie.JSESSIONID.name}
	: ${cookie.JSESSIONID.value}



	<%
		int a = 10;
		int b = 0;
		int c = a/b;
		out.print(c);
	%>




</body>
</html>