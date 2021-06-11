package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.StudentBean;
import com.util.DbConnection;

public class StudentDao {

	public int insertStudent(StudentBean student) {
		// insertStudent(String firstName,String email,String password) {
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

			int records = pstmt.executeUpdate(); //

			// executeUpdate() | state -> db [insert,update,delete]
			// executeQuery() | read - select
			// execute() |
			return records;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public ArrayList<StudentBean> getAllStudents() {

		ArrayList<StudentBean> students = new ArrayList<>();
		try (Connection con = DbConnection.getConnection();
				PreparedStatement pstmt = con.prepareStatement("select * from student");) {
			ResultSet rs = pstmt.executeQuery();// student --cursor

			while (rs.next()) { // true
				// jump to 1st record
				StudentBean sb = new StudentBean();
				sb.setStudentId(rs.getInt("studentId"));
				sb.setEmail(rs.getString("email"));
				sb.setPassword(rs.getString("password"));
				sb.setFirstName(rs.getString("firstName"));
				students.add(sb);
			
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return students;
	}

}
