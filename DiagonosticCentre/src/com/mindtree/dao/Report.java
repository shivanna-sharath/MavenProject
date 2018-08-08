package com.mindtree.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mindtree.connection.CreateConnection;

public class Report {
	CreateConnection conb = new CreateConnection();
	Connection con = conb.connectionToDB();

	public void GenerateReport(String inp) throws SQLException {
		Statement stmt = con.createStatement();
		String queryToSelectEmail = "SELECT P.NAME,P.EMAIL,P.PHONE,P.DATE FROM pATIENT WHERE EMAIL='" + inp
				+ "' OR PHONE='" + inp + "'";

		ResultSet rs = stmt.executeQuery(queryToSelectEmail);
		con.close();
		stmt.close();

	}

}
