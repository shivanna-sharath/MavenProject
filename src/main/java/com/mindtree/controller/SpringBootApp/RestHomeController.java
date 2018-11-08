package com.mindtree.controller.SpringBootApp;

import java.sql.SQLException;
import java.util.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.Dao.CalculateDate;
import com.mindtree.Dao.TestEntry;
import com.mindtree.client.DiagnosticSystemManager;
import com.mindtree.exceptions.InvalidEmailidException;
import com.mindtree.exceptions.InvalidPhonenumberException;
import com.mindtree.exceptions.IvalidDateException;
@CrossOrigin
@RestController
public class RestHomeController {
	@ResponseBody
	@RequestMapping(value="/add"	)
	public String met1(@RequestParam String var1,@RequestParam String var2,@RequestParam String var3) throws SQLException {
		
	
			DiagnosticSystemManager callfetch = new DiagnosticSystemManager();
	boolean flag=false;
	try{
		flag = callfetch.fetchdetails(var1 ,var2 );
	} catch (InvalidEmailidException e) {
	
	} catch (InvalidPhonenumberException e) {
	
	}
		
if(flag==false) { 
	return "patient not found";

}
else {
	TestEntry ab=new TestEntry();
	ab.AddTest(var1,var2,var3);
}
		return var1+" "+var2+" "+var3;		
	}
	@ResponseBody
	@RequestMapping(value="/report")
	public String met2(@RequestParam String var1,@RequestParam String var2,@RequestParam String var3) throws SQLException {
		//return var1+" "+var2+" "+var3;
		/**/
		DiagnosticSystemManager callfetch = new DiagnosticSystemManager();
		boolean flag = false ;
		try {
			flag = callfetch.fetchdetails(var1 ,var2 );
		} catch (InvalidEmailidException e) {

			e.printStackTrace();
		} catch (InvalidPhonenumberException e) {

		}
	if(flag==false) {
		return "patient not found";

	}
	else {
		CalculateDate Date=new CalculateDate();
		String report;
		try {
			report = Date.AddTest(var1,var2,var3);
		
		if(report.equals("not exist"))
		{
			return "enter valid date";
		}
		else
		return report;
		
	} catch (IvalidDateException e) {
	
		
	}
	}
	return " ";
	}
}
	


