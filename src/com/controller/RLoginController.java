package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.UserBean;
import com.dao.UserDao;

public class RLoginController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UserDao userDao = new UserDao();
		UserBean user = userDao.authentiacte(email, password);

		RequestDispatcher rd = null;
		if (user == null) {
			request.setAttribute("error", "Invalid Credentials");
			rd = request.getRequestDispatcher("RLogin.jsp");
			rd.forward(request, response);

		} else {
			// cookie
			Cookie userId = new Cookie("userId", user.getUserId() + "");//string only
			Cookie userName = new Cookie("firstName", user.getFirstName());

			//
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(60 * 2);//
			session.setAttribute("user", user);

			userId.setMaxAge(60 * 60 * 24 * 3);// seconds
			userName.setMaxAge(60 * 60 * 24 * 5);// seconds
			response.addCookie(userId); // this will add cookie in browser
			response.addCookie(userName);

			// role
			String url = "RHome.jsp";
			url = response.encodeURL(url); // RHome.jsp;JSESSIONID=45jlk5kjl6
			
			response.sendRedirect(url);
		}

	}
}
