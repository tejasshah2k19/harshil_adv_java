package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class RSignupController extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("init from signup controller");

		// //
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("service from signup controller");
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		UserBean user = new UserBean();

		boolean isError = false;
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "<font color='red'>Please Enter FirstName</font>");
		} else {
			user.setFirstName(firstName);
		}
		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "<font color='red'>Please Enter Email</font>");
		} else {
			user.setEmail(email);
		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter Password");
		} else {
			user.setPassword(password);
		}

		if (isError) {

			request.setAttribute("user", user);
			RequestDispatcher rd = request.getRequestDispatcher("RSignup.jsp");
			rd.forward(request, response);

		} else {
			// save user data into users array list
			//user.setUserId(UserDao.userCounter++);
 			UserDao.users.add(user);

			RequestDispatcher rd = request.getRequestDispatcher("RLogin.jsp");
			rd.forward(request, response);
		}
	}

	@Override
	public void destroy() {
		System.out.println("destroy from signup controller");

	}
}
