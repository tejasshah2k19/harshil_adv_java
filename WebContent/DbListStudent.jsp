
<%@page import="com.bean.StudentBean"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html; charset=ISO-8859-1" language="java"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
</head>
<body>
	<%
		ArrayList<StudentBean> students = (ArrayList<StudentBean>) request.getAttribute("students");
	%>
	<%@include file="Header.jsp" %>

	<div class="container">

		<div class="row">
			<div class="col-md-6">
				<table class="table table-hover">
					<thead>
						<tr>
							<td>StudentId</td>
							<td>FirstName</td>
							<td>Email</td>


							<td>Password</td>
							<td>Action</td>
						</tr>
					</thead>
					<tbody>
						<%
							for (StudentBean sb : students) {
						%>
						<tr>
							<td><%=sb.getStudentId()%></td>
							<td><%=sb.getFirstName()%></td>
							<td><%=sb.getEmail()%></td>
							<td><%=sb.getPassword()%></td>
							<td><a href="DbEditStudentController?studentId=<%=sb.getStudentId()%>"> Edit </a> |<a href="DbDeleteStudentController?studentId=<%=sb.getStudentId()%>"> Delete </a></td>
						</tr>
						<%
							}
						%>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>