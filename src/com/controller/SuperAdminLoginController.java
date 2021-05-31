package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuperAdminLoginController extends HttpServlet {

	String dbEmail = "";
	String dbPassword = "";

	@Override
	public void init(ServletConfig config) throws ServletException {
		dbEmail = config.getInitParameter("email");
		dbPassword = config.getInitParameter("password");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// original u p === em pass

//		ServletConfig config = getServletConfig();

		if (dbEmail.equalsIgnoreCase(email) && dbPassword.equals(password)) {
			response.sendRedirect("SuperAdminHome.jsp");
		} else {
			response.sendRedirect("SuperAdminLogin.jsp");
		}

	}

}
