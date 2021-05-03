package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;

public class DeleteUserController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int userId = Integer.parseInt(request.getParameter("userId"));

		int i = 0;
		for (; i < UserDao.users.size(); i++) {

			if (UserDao.users.get(i).getUserId() == userId) {
				break;
			}
		}

		UserDao.users.remove(i);

		response.sendRedirect("ListAllUsersController");
	}

}
