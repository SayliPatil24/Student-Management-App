package com.student;


import java.sql.Connection;

import  java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class StudentDao {
	
public  static  boolean insertStudentToDB(Student st) {
	//JDBC CODE for data insert
      boolean f=false;
	try {
		Connection con = CP.createC();
		String q="insert into Students(sname,sphone,scity)values(?,?,?)";
		//preapare statment
		PreparedStatement pstmt  =con.prepareStatement(q);
		//set value of parameter
		pstmt.setString(1,st.getStudentName());
		pstmt.setString(2,st.getStudentPhone());
		pstmt.setString(3,st.getStudentCity());
		
		//execute
		pstmt.executeUpdate();
		f=true;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
}

public static boolean deleteStudent(int userId) {
	// TODO Auto-generated method stub
	
	 boolean f=false;
		try {
			Connection con = CP.createC();
			String q="delete from students where sid=?";
			//preapare statment
			PreparedStatement pstmt  =con.prepareStatement(q);
			//set value of parameter
			pstmt.setInt(1,userId);
			
			//execute
			pstmt.executeUpdate();
			f=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
}

public static void showAllStudent() {
	// TODO Auto-generated method stub

	 boolean f=false;
		try {
			Connection con = CP.createC();
			String q="Select * from students"; 
			    Statement stmt=(Statement) con.createStatement();
			ResultSet set=stmt.executeQuery(q);
			 while(set.next()) {

				 int id = set.getInt(1);
			  String name=set.getString(2);
			String phone=set.getString(3);
			String city=set.getString("scity");
			
			  System.out.println("ID:"+id);
			  System.out.println("Name"+name);
			  System.out.println("Phone"+phone);
			  System.out.println("City"+city);
			  System.out.println("++++++++++++");
		
			 }}
				 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
}
}
