package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class RLoginController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UserDao userDao = new UserDao();
		UserBean user = userDao.authentiacte(email, password);

		RequestDispatcher rd = null;
		if (user == null) {
			request.setAttribute("error", "Invalid Credentials");
			rd =request.getRequestDispatcher("RLogin.jsp");
		}else {
			request.setAttribute("user", user);
			rd = request.getRequestDispatcher("RHome.jsp");
		
		}
		
		rd.forward(request, response);
	}

}
