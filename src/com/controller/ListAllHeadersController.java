package com.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListAllHeadersController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Enumeration<String> allHEaders = request.getHeaderNames();// Enumeration of all headers

		request.setAttribute("allHeaders", allHEaders);

		request.getRequestDispatcher("PrintAllHeaders.jsp").forward(request, response);
		
		
	}

}
