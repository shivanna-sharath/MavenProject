package com.mindtree.exceptions;

import java.sql.SQLException;

public class MyException extends Exception {
	public  MyException(String error, Throwable e ) {
		System.out.println("sqlException");
		
	}

}
