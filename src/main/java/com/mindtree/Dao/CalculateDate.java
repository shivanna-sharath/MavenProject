package com.mindtree.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mindtree.exceptions.IvalidDateException;
import com.mindtree.util.Conectiontod;

public class CalculateDate {

	Conectiontod conb = new Conectiontod();
	Connection con = conb.connectionToDB();

	public String AddTest(String var1, String var2, String var3) throws SQLException,IvalidDateException {
		String dat = var3.substring(6) + "-" + var3.substring(3, 5) + "-" + var3.substring(0, 2);
		Statement stmt1 = con.createStatement();
		 Statement stmt2 = con.createStatement();
		try {
			String query = "SELECT * FROM pATIENT_TEST WHERE DATE='" + dat + "'";

			ResultSet rs = stmt1.executeQuery(query);

			if (rs.next()) {
				String query1 = "SELECT * FROM PATIENT WHERE EMAIL='" + var1 + "' or phone='" + var2 + "'";
				ResultSet rss = stmt1.executeQuery(query1);
				System.out.println("Personal Details");
				while (rss.next()) {
					System.out.print(rss.getString(1));
					System.out.print(" "+rss.getString(2));
					System.out.print(" "+rss.getString(3));
					System.out.println(" "+rss.getString(4));

				}

				String query11 = "SELECT TID,COUNT(TID) FROM PATIENT_TEST WHERE DATE='" + dat
						+ "' AND PID IN(SELECT PID FROM PATIENT WHERE EMAIL='" + var1 + "'or phone='" + var2
						+ "') GROUP BY TID";
				ResultSet rs1 = stmt1.executeQuery(query11);

				System.out.println("\tTest details:");
				System.out.println();
				System.out.println("\tTest \t\t Cost");
				String xxx="";
				while (rs1.next()) {
					int count = rs1.getInt(2);
					int tid = rs1.getInt(1);
					System.out.println("tid: "+tid);
					String query2 = "SELECT T.NAME,T.COST FROM TEST T WHERE T.T_ID='" + tid + "'";
					ResultSet rs2 = stmt2.executeQuery(query2);
					
					while (rs2.next()) {
						xxx+=rs2.getString(1) + "  " + (count * rs2.getInt(2))+"<br>";
						//System.out.println("\t" + rs2.getString(1) + "\t\t" + count * rs2.getInt(2));
						//return (("\t" + rs2.getString(1) + "\t\t" + count * rs2.getInt(2)));
					}
					
					
				}
				System.out.println("report\n"+xxx);
				return xxx;

			} else {
				return "not exist";
			}
		}

		catch (SQLException e) {

		}
		con.close();
		stmt1.close();
		return "";

	}

}
