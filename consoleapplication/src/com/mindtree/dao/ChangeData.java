package com.mindtree.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mindtree.connection.CreateConnection;

public class ChangeData {
	CreateConnection conb = new CreateConnection();
	Connection con = conb.connectionToDB();
	public void ChangeDataMet() throws SQLException {
		
		Statement stmt = con.createStatement();
		String query = "UPDATE PLAYERS SET RUNSSCORED = '400' WHERE WICKETStAKEN >20;";
		stmt.executeUpdate(query);
		
		
		
	}

}
