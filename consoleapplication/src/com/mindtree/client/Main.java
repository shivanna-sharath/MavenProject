package com.mindtree.client;

import java.sql.SQLException;
import java.util.Scanner;

import com.mindtree.manager.AddPlayer;
import com.mindtree.manager.DeleteFromTable;
import com.mindtree.manager.DisplayPlayer;
import com.mindtree.manager.UpdateData;

public class Main {

	public static void main(String[] args) throws SQLException {
		System.out.println("enter your choice");
		System.out.println("1.insert player");
		System.out.println("2.display");
		System.out.println("3. Delete");
		System.out.println("4.update ");
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();
		switch (choice) {
		case "1":
			AddPlayer a=new AddPlayer();
			a.AddPlayerMet();
			break;
		case "2":
			DisplayPlayer b=new DisplayPlayer();
			b.DisplayPlayerMet();
			break;
		case "3":
			DeleteFromTable c=new DeleteFromTable();
			c.DeleteFromTableMet();
			break;
		case "4":
			UpdateData d=new UpdateData();
			d.UpdateDataMet();
			break;
		default:
			System.out.println("wrong entry");
			break;
		}

	}

}