package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;

public class DbUpdateStudentController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		int studentId = Integer.parseInt(request.getParameter("studentId"));
		

		StudentBean student = new StudentBean();
		student.setFirstName(firstName);
		student.setEmail(email);
		student.setStudentId(studentId);

		// insert
		StudentDao studentDao = new StudentDao();
		int records = studentDao.updateStudent(student);

		if(records == 0) {
			//something went wrong 
			//error set 
			//dispay jsp 
		}else {
			response.sendRedirect("DbListStudentController");
		}


	}

}
