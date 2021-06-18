<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@taglib uri="myelfunction"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	request.setAttribute("msg", "gabbar");
	session.setAttribute("msg","basanti1");
	application.setAttribute("msg","samba");

	
%> 
msg: ${sessionScope.msg}<br>
cookie: ${cookie.JSESSIONID.name } => ${cookie.JSESSIONID.value }<br>
initParam:globalEmail : ${initParam.globalEmail}<br>
userName : <%=config.getInitParameter("userName") %>



<pre>
	First it will search in pageScope   --> Jsp / Servlet --> pageScope.propertyName 
					next requestScope   --> HttpServletRequest --> requestScope.propertyName 
					next sessionScope    --> HttpSession --> sessionScope.propertyName 
					next applicationScope  -> ServletContext --> applicationScope.propertyName 

	cookies => cookie.cookieName.value 

</pre>

<br><br>
	${s:greet() }

<Br><BR>
</body>
</html>