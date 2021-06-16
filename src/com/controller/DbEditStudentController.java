package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;

public class DbEditStudentController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		int studentId = Integer.parseInt(request.getParameter("studentId"));
		
		StudentDao studentDao = new StudentDao();
		StudentBean sb = studentDao.getDataById(studentId);
		
		request.setAttribute("sb", sb);
		request.getRequestDispatcher("DbEditStudent.jsp").forward(request, response);
		
	}

}
