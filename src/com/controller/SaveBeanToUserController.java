package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.UserBean;
import com.dao.UserDao;

/**
 * Servlet implementation class SaveBeanToUserController
 */
public class SaveBeanToUserController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		UserBean user = (UserBean) session.getAttribute("user");

		UserDao userDao = new UserDao();
		UserDao.users.add(user);
		response.sendRedirect("ListAllUsersController");
		
		
	}
}
