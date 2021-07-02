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

	<c:forEach var="user"  items="${users}">
		${user.userId } | <c:out value="${user.firstName}"></c:out><br>
	
	</c:forEach>
	<br><br>
	
	<c:forTokens items="${data}" delims=","  var="s">
		<c:out value="${s }"></c:out><br>
	</c:forTokens>
	
	<br><br>
	
	
	<c:forEach var="i" begin="1"  end="10" step="1">
		${i}<br>
	</c:forEach>
	
	
	

</body>
</html>