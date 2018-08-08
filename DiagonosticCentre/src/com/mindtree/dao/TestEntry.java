package com.mindtree.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mindtree.connection.CreateConnection;

import com.mindtree.exception.InvalidTestNameException;

public class TestEntry {
	CreateConnection conb = new CreateConnection();
	Connection con = conb.connectionToDB();
	public String queryToSelectnumber;

	public String AddTest(String inp) throws SQLException, InvalidTestNameException {

		Statement stmt = con.createStatement(); // crating statement (statement may be simple or prepared)
		
		String queryToSelectEmail = "SELECT * FROM TEST WHERE NAME='" + inp + "'";

		ResultSet rs = stmt.executeQuery(queryToSelectEmail); // storing query result in result set

		if (rs.next()) {
		
			stmt.close();
			return "EXIST";
		}

		else {

			throw new InvalidTestNameException();
		}
		
	}

}
