package com.mindtree.connection;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {
	Connection con = null;
	public Connection connectionToDB()  {

		

		try {

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crricket", "root", "Welcome123");

		} catch (Exception e) {

			System.out.println("create" + e);
		}
	

		return con;
		
	}
	
	public void closere() throws SQLException {
		
		con.close();
		
	}

}

