package com.mindtree.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.sound.midi.InvalidMidiDataException;

import com.mindtree.connection.CreateConnection;
import com.mindtree.exception.IvalidDateException;

public class CheckDate {
	Scanner in = new Scanner(System.in);
	CreateConnection conb = new CreateConnection();
	Connection con = conb.connectionToDB();

	public String TestDate(String inp) throws SQLException {
		System.out.println("enter test date");
		String dat1 = in.nextLine();
		String dat=dat1.substring(6)+"-"+dat1.substring(3,5)+"-"+dat1.substring(0,2);
		Statement stmt1 = con.createStatement();
		Statement stmt2 = con.createStatement();
	try {
		String queryToSelectEmail = "SELECT * FROM pATIENT_TEST WHERE DATE='" + dat + "'";

		ResultSet rs = stmt1.executeQuery(queryToSelectEmail);
		

		if (rs.next()) {
			String query1 = "SELECT * FROM PATIENT WHERE EMAIL='"+inp+"' or phone='"+ inp+"'";
			ResultSet rss = stmt1.executeQuery(query1);
			System.out.println("Personal Details");
			while(rss.next())
			{
				System.out.println(rss.getString(2));
				System.out.println(rss.getString(3));
				System.out.println(rss.getString(4));
				
			}

			String query = "SELECT TID,COUNT(TID) FROM PATIENT_TEST WHERE DATE='" + dat
					+ "' AND PID IN(SELECT PID FROM PATIENT WHERE EMAIL='" + inp + "'or phone='" + inp
					+ "') GROUP BY TID";
			ResultSet rs1 = stmt1.executeQuery(query);
			
			
			System.out.println("\tTest details:");
			System.out.println();
			System.out.println("\tTest \t\t Cost");
			while (rs1.next()) {
				int count = rs1.getInt(2);
				int tid = rs1.getInt(1);
				

				String query2 = "SELECT T.NAME,T.COST FROM TEST T WHERE T.T_ID='"+tid+"'";
				ResultSet rs2 = stmt2.executeQuery(query2);
				while (rs2.next()) {
					System.out.println("\t"+rs2.getString(1)+"\t\t"+count * rs2.getInt(2));

				}
			}
			return "EXIST";
		} else {
			System.out.println("Invalid Date");
			TestDate(inp);
			
		}
		
		}
	
	
	catch( SQLException e) {
		
	}
	con.close();
	stmt1.close();

	

return"";
	}
		

	}



