package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;
import com.dao.UserDao;

public class DbSignupServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		StudentBean student = new StudentBean();
		student.setFirstName(firstName);
		student.setEmail(email);
		student.setPassword(password);

		// insert
		StudentDao studentDao = new StudentDao();
		int records = studentDao.insertStudent(student);

		if(records == 0) {
			//something went wrong 
			//error set 
			//dispay jsp 
		}else {
			response.sendRedirect("DbListStudentController");
		}

		
	}

}
