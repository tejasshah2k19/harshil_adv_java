package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class EditUserController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int userId = Integer.parseInt(request.getParameter("userId"));
		for (UserBean user : UserDao.users) {
			if (user.getUserId() == userId) {
				request.setAttribute("user", user);
				break;
			}
		}

		request.getRequestDispatcher("EditUser.jsp").forward(request, response);
	}
}
