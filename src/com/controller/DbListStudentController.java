package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;

public class DbListStudentController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		StudentDao studentDao = new StudentDao();
		
		ArrayList<StudentBean> students = studentDao.getAllStudents(); //db -->10 student ->10bean 
		request.setAttribute("students", students);
		request.getRequestDispatcher("DbListStudent.jsp").forward(request, response);
		
	}

}
