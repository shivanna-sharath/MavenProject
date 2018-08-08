package com.mindtree.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mindtree.util.Conectiontod;

public class TestEntry {
	Conectiontod conb = new Conectiontod();
	Connection con = conb.connectionToDB();

	public String queryToSelectnumber;

	public String AddTest(String var1,String var2,String var3) throws SQLException {

		Statement stmt = con.createStatement(); // crating statement (statement may be simple or prepared)

		String queryToSelectEmail = "SELECT * FROM TEST WHERE NAME='" + var3 + "'";

		ResultSet rs = stmt.executeQuery(queryToSelectEmail); // storing query result in result set

		if (rs.next()) {
			String query = "SELECT P.PID,T.T_ID FROM PATIENT P,TEST T WHERE (P.EMAIL='" + var1 + "' OR P.PHONE='" + var2
					+ "') AND T.NAME='" + var3 + "'";
			rs = stmt.executeQuery(query);
			rs.next();

			String ins = "INSERT INTO PATIENT_TEST VALUES('" + rs.getInt(1) + "','" + rs.getInt(2) + "','2018-07-25')";
			stmt.executeUpdate(ins);
			
			
			stmt.close();
			return "EXIST";
		}
		return "not exist";
	
	

	}

}
