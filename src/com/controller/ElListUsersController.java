package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;

public class ElListUsersController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("users", UserDao.users);
		request.setAttribute("data", "mon,tue,wen,thus,fri,sat,sun");
		request.getRequestDispatcher("CoreTagListDemo.jsp").forward(request, response);
	}

}
