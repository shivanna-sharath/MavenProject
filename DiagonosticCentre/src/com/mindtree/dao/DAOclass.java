package com.mindtree.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import com.mindtree.connection.CreateConnection;

public class DAOclass {
	CreateConnection conb = new CreateConnection();
	Connection con = conb.connectionToDB();

	public void InsertintoDB(String inp, String tname) throws SQLException {
		
		Statement stmt = con.createStatement();
		String query = "SELECT P.PID,T.T_ID FROM PATIENT P,TEST T WHERE (P.EMAIL='" + inp + "' OR P.PHONE='" + inp
				+ "') AND T.NAME='" + tname + "'";

		ResultSet rs = stmt.executeQuery(query);
		rs.next();

		String ins = "INSERT INTO PATIENT_TEST VALUES('" + rs.getInt(1) + "','" + rs.getInt(2) + "','2018-07-25')";
		stmt.executeUpdate(ins);
		
		  con.close();
		  stmt.close();
		
	}
}
