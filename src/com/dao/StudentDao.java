package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.StudentBean;
import com.util.DbConnection;

public class StudentDao {

	public void insertStudent(StudentBean student) {
			//insertStudent(String firstName,String email,String password) {
		// to exeucute any query in db using jdbc we have
		// two main interface that we can use
		// 1) Statement -- NO precompile -->run
		// 2) PreparedStatement --> precompile
		try (Connection con = DbConnection.getConnection();
				PreparedStatement pstmt = con
						.prepareStatement("insert into student (firstName,email,password) values (?,?,?)");) {

			pstmt.setString(1, student.getFirstName()); // pstmt.setString(1,firstName); 
			pstmt.setString(2, student.getEmail());
			pstmt.setString(3, student.getPassword());
			pstmt.executeUpdate(); // 
			
 		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
