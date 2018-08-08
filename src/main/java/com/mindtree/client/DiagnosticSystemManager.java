package com.mindtree.client;

import java.sql.SQLException;

import com.mindtree.entity.Patient;
import com.mindtree.exceptions.InvalidEmailidException;
import com.mindtree.exceptions.InvalidPhonenumberException;
import com.mindtree.Dao.*;

public class DiagnosticSystemManager {

	public boolean fetchdetails(String var1, String var2)
			throws SQLException, InvalidEmailidException, InvalidPhonenumberException {
		Patient p = new Patient();
		Retrive Extractdata = new Retrive();
p.setEmail(var1);
boolean exists = Extractdata.DatabaseDataE(p);
if (exists) {
	return true;
}

p.setPhone(var2);
boolean exists1 = Extractdata.DatabaseDataM(p);
if (exists1) {
	return true;
} else {
	System.out.println("wrong entry");
	return false;
}
	}

}
