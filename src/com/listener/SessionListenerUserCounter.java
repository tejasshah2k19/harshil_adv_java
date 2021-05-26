package com.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//1) implements XXXListener 
//2) override method 
//3) logic 
//4) map your listener into web.xml 

public class SessionListenerUserCounter implements HttpSessionListener {
	
	public static int userCounter = 0;
	// session create
	public void sessionCreated(HttpSessionEvent e) {
		userCounter++;
		System.out.println("new user LoggedIn");
		System.out.println("Total LoggedIn user = "+userCounter);
	}

	// session destroy
	public void sessionDestroyed(HttpSessionEvent e) {
		userCounter--;
		System.out.println("user LoggedOut");
		System.out.println("Total LoggedIn user = "+userCounter);

	}
}
