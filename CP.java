package com.student;
import java.sql.*;
import java.sql.*;

public class CP {
	static Connection con;
	 
	
	
	
    public static Connection createC() {
    	
    	
    	try {
    		//load the driver
    		Class.forName("com.mysql.jdbc.Driver");
    		
    		
    		String user="root";
    		String password="Patilsau@123";
    		String url="Jdbc:mysql://localhost:3306/student_manage";
    		  
    		//create the connection
    		
    		con=DriverManager.getConnection(url, user,password);
		} catch (Exception e) {
    	e.printStackTrace();
			// TODO: handle exception
		}
        return con;
    		
    		
    	
    	}
    }

