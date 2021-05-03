package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;

public class RUpateController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		int userId = Integer.parseInt(request.getParameter("userId"));

		for (int i = 0; i < UserDao.users.size(); i++) {
			if (UserDao.users.get(i).getUserId() == userId) {
				UserDao.users.get(i).setEmail(email);
				UserDao.users.get(i).setFirstName(firstName);
				break;
			}
		}

		response.sendRedirect("ListAllUsersController");
	}

}
