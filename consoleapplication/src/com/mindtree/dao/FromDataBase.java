package com.mindtree.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mindtree.connection.CreateConnection;

public class FromDataBase {
	CreateConnection conb = new CreateConnection();
	Connection con = conb.connectionToDB();

	public void FromDataBaseMet() throws SQLException {
		Statement stmt = con.createStatement();
		String query = "SELECT * FROM players WHERE RUNSSCORED>=100 && WICKETSTAKEN>=15";

		ResultSet rs = stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getString(3));
			
			
		}
		
	}

}
