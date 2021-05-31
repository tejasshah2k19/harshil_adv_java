package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApplicationContextDemoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//application 
		//ApplicationContext 
		
		
		
		ServletContext context = getServletContext();
		String globalEmail = context.getInitParameter("globalEmail");
		Cookie c = new Cookie("globalEmail", globalEmail);
		response.addCookie(c);
		
		response.sendRedirect("index.html");
	
	}

}
