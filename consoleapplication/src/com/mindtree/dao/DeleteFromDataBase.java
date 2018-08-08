package com.mindtree.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mindtree.connection.CreateConnection;

public class DeleteFromDataBase {
	CreateConnection conb = new CreateConnection();
	Connection con = conb.connectionToDB();

	public void DeleteDataBaseMet() throws SQLException {
		Statement stmt = con.createStatement();
		String query = "dELETE FROM COUNTRY WHERE COUNTRYID NOT IN (SELECT COUNTRYID FROM PLAYERS f)";
		stmt.executeUpdate(query);
			
		
		
		
	}

}
