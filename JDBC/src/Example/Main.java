package Example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diagnostic_centre", "root", "Welcome123");
		Statement stmt = con.createStatement(); // crating statement (statement may be simple or prepared)
		
		
	}

}