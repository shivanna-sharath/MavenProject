package com.mindtree.manager;

import java.sql.SQLException;

import com.mindtree.dao.DeleteFromDataBase;

public class DeleteFromTable {
	public void DeleteFromTableMet() throws SQLException {
		DeleteFromDataBase a=new DeleteFromDataBase();
		a.DeleteDataBaseMet(); 
	}

}
