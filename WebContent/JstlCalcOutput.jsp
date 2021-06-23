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


	<c:set var="n1" value="${param.n1}"></c:set>
	<c:set var="n2" value="${param.n2}"></c:set>
	<c:set var="opr" value="${param.opr}"></c:set>
	<c:set var="count" value="0"></c:set>

	<c:if test="${n1 == 0}">
		<Br>Please Enter N1
		<c:set var="n1Error" value="Please Enter N1" scope="session">
		</c:set>
		<c:set var="count" value="1"></c:set>

	</c:if>


	<c:if test="${n2 == 0}">
		<Br> Please Enter N2 
		<c:set var="n2Error" value="Please Enter N2" scope="request">
		</c:set>
		<c:set var="count" value="1"></c:set>

	</c:if>


	<c:if test="${opr == null}">
		<br> Please select operation 
				<c:set var="oprError" value="Please Select operation"
			scope="request">
		</c:set>
		<c:set var="count" value="1"></c:set>

	</c:if>



	<c:if test="${count==1 }">
		<%-- <c:redirect  url="JstlCalcInput.jsp" ></c:redirect> --%>

		<% request.getRequestDispatcher("JstlCalcInput.jsp").forward(request,response); %>
	</c:if>











	<c:out value="${n1}"></c:out>
	<br>
	<c:out value="${n2}"></c:out>
	<br>
	<c:out value="${opr}"></c:out>

	<br> Ans :
	<c:choose>
		<c:when test="${opr == 1 }">
			<c:out value="${n1+n2}"></c:out>
		</c:when>
		<c:when test="${opr == 2 }">
				${n1-n2 }
		</c:when>

		<c:when test="${opr == 3 }">
				${n1*n2 }
		</c:when>
		<c:when test="${opr == 4 }">
				${n1/n2 }
		</c:when>
		<c:otherwise>
			Invalid Choice 
		</c:otherwise>

	</c:choose>




</body>
</html>