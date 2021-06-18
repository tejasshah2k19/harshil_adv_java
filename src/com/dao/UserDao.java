package com.dao;

import java.util.ArrayList;

import com.bean.UserBean;

public class UserDao {

	public static int userCount = 1;
	public static ArrayList<UserBean> users = new ArrayList<UserBean>();

	static {
		System.out.println("user init....");
		UserBean user1 = new UserBean();
		user1.setEmail("admin@gmail.com");
		user1.setFirstName("admin1");
		user1.setPassword("admin1");

		UserBean user2 = new UserBean();
		user2.setEmail("ram@gmail.com");
		user2.setFirstName("Ram");
		user2.setPassword("ram");

		users.add(user1);
		users.add(user2);
	}

	public UserBean authentiacte(String email, String password) {
		for (UserBean user : users) {
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

	//

}
