package com.elfunction;

import java.util.Date;

public class GreetFunction {

	public static String greet() {

		Date d = new Date();

		if (d.getHours() >= 0 && d.getHours() <= 11) {
			return "Good Morning";
		} else if (d.getHours() >= 12 && d.getHours() <= 17) {
			return "Good Noon";
		} else if (d.getHours() >= 18 && d.getHours() <= 23) {
			return "Good Evening";
		} else {
			return "You are not on earth";
		}
	}
}
