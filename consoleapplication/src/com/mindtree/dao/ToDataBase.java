package com.mindtree.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mindtree.connection.CreateConnection;

public class ToDataBase {
	CreateConnection conb = new CreateConnection();
	Connection con = conb.connectionToDB();


	public void todatabasemet(int id, String name, String score, String wickets) throws SQLException {
		Statement stmt = con.createStatement();
		System.out.println(id);
		System.out.println(name);
		System.out.println(score);
		
		String query = "insert into players(countryId,PlayerName,RunsScored,WicketsTaken) values(" + id + ",'" + name +"','"+score +"','"+wickets+"')";

		stmt.executeUpdate(query);
		stmt.close();
		
		
	}

}
