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
			if(session.getAttribute("user") == null){
				response.sendRedirect("RLogin.jsp");
			}
		%>

	Welcome From Cookie==>  , ${cookie.firstName.value}
	<br>
	Welcome From Session =>,${sessionScope.user.firstName }

	
	<%
		String url = "RLogoutController";
		url = response.encodeURL(url);	
	
	%>
	<a href="<%=url%>">Logout</a>
</body>
</html>