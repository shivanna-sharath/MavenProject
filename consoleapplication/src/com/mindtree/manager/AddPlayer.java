package com.mindtree.manager;

import java.sql.SQLException;
import java.util.Scanner;

import com.mindtree.dao.ToDataBase;

public class AddPlayer {
	public void AddPlayerMet() throws SQLException {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the coutry id");
		int id=in.nextInt();
		in.nextLine();
		System.out.println("enter the player name");
		String name=in.nextLine();
		System.out.println("enter the score");
		String Score=in.nextLine();
		System.out.println("enter the wickets");
		String Wickets=in.nextLine();
		ToDataBase a=new ToDataBase();
		a.todatabasemet(id,name,Score,Wickets);
		
		
	}

}
