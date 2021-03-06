package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RLogoutController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//
		// below line will not carry forward current request object
		// it will create new request object

//		Cookie c[] = request.getCookies();
//
//		for (Cookie ck : c) {
//			ck.setMaxAge(0);
//			response.addCookie(ck);
//		}
//
		HttpSession session = request.getSession();
		session.invalidate();// destroy current request session

		response.sendRedirect("RLogin.jsp");

	}

}
