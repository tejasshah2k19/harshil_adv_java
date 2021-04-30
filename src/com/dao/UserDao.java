package com.dao;

import java.util.ArrayList;

import com.bean.UserBean;

public class UserDao {
	public static int userCount = 1;
	public static ArrayList<UserBean> users = new ArrayList<UserBean>();

	public UserBean authentiacte(String email, String password) {
		for (UserBean user : users) {
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
}
