package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String hobbies[] = request.getParameterValues("hobby");
		System.out.println(firstName);
		System.out.println(email);
		System.out.println(password);
		System.out.println(gender);
		System.out.println(city);
		for (String h : hobbies) {
			System.out.println(h);
		}

//		response.setContentType("text/html");
//
//		PrintWriter out = response.getWriter(); //
//
//		out.print("<html>");
//		out.print("<body>");
//
//		out.print("FirstName : " + firstName + "<br>");
//		out.print("Email : " + email + "<br>");
//		out.print("Gender : " + gender + "<br>");
//		out.print("City : " + city + "<br>");
//		out.print("Hobby : ");
//		for (String h : hobbies) {
//			out.println(h + " ");
//		}
//		out.print("<img src='a.jpg'>");
//		out.print("</body></html>");

		//
		// request , , ,

		// servlet ->data -->send -->jsp --> retrive
		// servlet -->data -->send-->servlet -->
		//

		request.setAttribute("firstName", firstName);
		request.setAttribute("email", email);
		request.setAttribute("pwd", password);

		RequestDispatcher rd = request.getRequestDispatcher("DisplaySignupData.jsp");
		rd.forward(request, response);
	}
}
