package com.mindtree.service;

import java.sql.SQLException;
import java.util.Scanner;

import com.mindtree.dao.RetrivingData;
import com.mindtree.entity.Patient;
import com.mindtree.exception.InvalidEmailidException;
import com.mindtree.exception.InvalidPhonenumberException;

public class DiagnosticSystemManager {
	Scanner in = new Scanner(System.in);
	RetrivingData Extractdata = new RetrivingData();

	public String fetchdetails(String inp, String detailstype)
			throws InvalidEmailidException, InvalidPhonenumberException, SQLException {
		Patient p = new Patient();

			if (detailstype == "email") {
				p.setEmail(inp);
				boolean exists = Extractdata.DatabaseDataE(p);
				if (!exists)
				{
					return "not exist"; 
				}
				else
				{
					return "EXIST";
				}
				
			} 
			else if (detailstype == "phone") {
				p.setPhone(inp);
				boolean exists = Extractdata.DatabaseDataM(p);
				if (!exists)
					return "number doesn't Exists";
			} else {
				System.out.println("wrong entry");
				return "not exist";
			}
	
		return "EXIST";

	}

}
