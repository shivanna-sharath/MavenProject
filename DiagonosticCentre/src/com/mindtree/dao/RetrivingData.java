package com.mindtree.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mindtree.connection.CreateConnection;
import com.mindtree.entity.Patient;
import com.mindtree.exception.InvalidEmailidException;
import com.mindtree.exception.InvalidPhonenumberException;

public class RetrivingData {
	CreateConnection conb = new CreateConnection();
	Connection con = conb.connectionToDB(); // creating connection object from connectionToDB method
	public String queryToSelectEmail;

	public boolean DatabaseDataE(Patient p) throws SQLException, InvalidEmailidException {

		String email = p.getEmail();
		Statement stmt = con.createStatement(); // crating statement (statement may be simple or prepared)

		String queryToSelectEmail = "SELECT * FROM pATIENT WHERE EMAIL='" + email + "'";

		ResultSet rs = stmt.executeQuery(queryToSelectEmail); // storing query result in result set
		if (rs.next()) {
			con.close();
			stmt.close();
			return true;
		
		}

		else {
			throw new InvalidEmailidException();
		}
		


	}
	

	public boolean DatabaseDataM(Patient p) throws SQLException, InvalidPhonenumberException {
		String number = p.getPhone();
		Statement stmt = con.createStatement();

		String queryToSelectnumber = "SELECT * FROM pATIENT WHERE PHONE='" + number + "'";

		ResultSet rs = stmt.executeQuery(queryToSelectnumber); // storing query result in result set
		if (rs.next()) {
			con.close();
			stmt.close();
			return true;
		}

		else {
			throw new InvalidPhonenumberException();
		}

	
	}
	
}
