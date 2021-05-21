package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.omg.CORBA.Request;

public class SignupFilter implements Filter {

	public void init(javax.servlet.FilterConfig arg0) throws javax.servlet.ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// validation

		boolean isError = false;
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "<font color='red'>Please Enter FirstName</font>");
		} else {
			request.setAttribute("firstNameValue", firstName);
		}
		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "<font color='red'>Please Enter Email</font>");
		} else {
			request.setAttribute("emailValue", email);
		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter Password");
		}

		if (isError) {
			// back signup
			RequestDispatcher rd = request.getRequestDispatcher("FilterSignup.jsp");
			rd.forward(request, response);

		} else {
			// go ahead

			// if second fitler was mapped with SignupController then call that second
			// filter
			// else call SignupController
			chain.doFilter(request, response);
			//
		}

	}

	public void destroy() {

	}
}
