<%@page import="com.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="a" value="10" scope="session"></c:set>

	<br>
	<c:out value="${a}" />

	<c:remove var="a" />


	<br> after Remove
	<br>

	<c:out value="${a}" />


	<c:catch var="e">
		<%
			int a = 20 / 0;
				out.print(a);
		%>


	</c:catch>

	<c:if test="${e!=null }">
		Divide by Zero
	</c:if>




	<c:set var="choice" value="2" />
<br>
	<c:choose>
		<c:when test="${choice == 1 }">
		you selected 1
	</c:when>

		<c:when test="${choice == 2 }">
		you selected 2
	</c:when>

		<c:otherwise>
		invalid choice
	</c:otherwise>

	</c:choose>

	<br><br>
	

</body>



</html>