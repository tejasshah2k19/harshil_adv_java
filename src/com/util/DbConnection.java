package com.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DbConnection {

	public static String url = "jdbc:mysql://localhost:3306/ocwcd";
	public static String userName = "root";
	public static String password = "root";
	public static String driver = "com.mysql.cj.jdbc.Driver"; // type 3-4

	public static Connection getConnection() {

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // load driver | register

		try {
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println(con);
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		getConnection();
	}
}
