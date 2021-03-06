package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;

public class DbDeleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		int studentId = Integer.parseInt(request.getParameter("studentId"));

		StudentDao studentDao = new StudentDao();
		studentDao.deleteStudentById(studentId);

		response.sendRedirect("DbListStudentController");
	
	}

}
