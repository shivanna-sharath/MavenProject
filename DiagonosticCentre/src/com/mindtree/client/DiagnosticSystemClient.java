package com.mindtree.client;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.mindtree.dao.CheckDate;
import com.mindtree.dao.DAOclass;
import com.mindtree.dao.TestEntry;
import com.mindtree.exception.InvalidEmailidException;
import com.mindtree.exception.InvalidPhonenumberException;
import com.mindtree.exception.InvalidTestNameException;
import com.mindtree.exception.IvalidDateException;
import com.mindtree.service.DiagnosticSystemManager;

public class DiagnosticSystemClient {

	public static void main(String[] args)
			throws SQLException, InvalidEmailidException, InvalidPhonenumberException, IvalidDateException {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int entry = 1;
		while (entry != 0) {

			System.out.println("enter your choi1ce");
			System.out.println("1.Add Diagnostic tests ");
			System.out.println("2.Generate Report ");
			System.out.println("3.Exit");
			String choice = in.next();
			int flag = 1;

			TestEntry CallTest = new TestEntry();
			//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-dd");

			String choice2;

			switch (choice) {
			case "1":
				System.out.println("Enter test details");
				System.out.println("1:fetch deatils by email");
				System.out.println("2:fetch details by phone number");

				String choice1 = in.next();
				DiagnosticSystemManager callfetch = new DiagnosticSystemManager();

				switch (choice1) {
				case "1":
					try {
						System.out.println("enter email ID");
						String inp = in.next();
						in.nextLine();
						String result = callfetch.fetchdetails(inp, "email");
						if (result == "EXIST") {
							int temp = 1;
							while (temp != 0) {
								System.out.println("enter test name");

								String tname = in.nextLine();

								String res = "";
								try {
									res = CallTest.AddTest(tname);
									System.out.println(res);
									if (res == "EXIST") {

										DAOclass call = new DAOclass();
										call.InsertintoDB(inp, tname);

										System.out.println("want to add more test [yes/no]");
										String s = in.next();
										in.nextLine();

										if (s.equals("no")) {
											temp = 0;
										} else if (!s.equals("yes") && !s.equals("no")) {
											System.out.println("invalid entry");
											break;
										}
									}
								} catch (InvalidTestNameException e) {
									// TODO Auto-generated catch block

								}

							}

						}
					} catch (InvalidEmailidException | InvalidPhonenumberException e) {
						continue;
					}
					break;
				case "2":
					try {
						System.out.println("enter phone number");
						String inp = in.next();
						in.nextLine();
						String result = callfetch.fetchdetails(inp, "phone");
						if (result == "EXIST") {
							int temp = 1;
							while (temp != 0) {

								System.out.println("enter test name");
								String tname = in.nextLine();
								String res = "";
								try {
									res = CallTest.AddTest(tname);
								} catch (InvalidTestNameException e) {
									// TODO Auto-generated catch block

								}

								if (res == "EXIST") {

									DAOclass call = new DAOclass();
									call.InsertintoDB(inp, tname);

									System.out.println("want to add more test [yes/no]");
									String s = in.next();
									in.nextLine();

									if (s.equals("no")) {
										temp = 0;
									} else if (!s.equals("yes") && !s.equals("no")) {
										System.out.println("invalid entry");
										break;

									}
								}
							}

						}
					}

					catch (InvalidEmailidException e) {
						continue;

					} catch (InvalidPhonenumberException e) {

					}
					break;
				default:
					System.out.println("enter valid number");
				}
				break;
			case "2": {
				System.out.println("1:fetch deatils by email");
				System.out.println("2:fetch details by phone number");
				DiagnosticSystemManager callfetch1 = new DiagnosticSystemManager();
				String choices2 = in.next();
				try {
					switch (choices2) {
					case "1":
						System.out.println("enter email ID");
						String inp = in.next();
						String result = callfetch1.fetchdetails(inp, "email");
						if (result == "EXIST") {
							CheckDate a = new CheckDate();
							String s = a.TestDate(inp);
						}
						break;
					case "2":
						System.out.println("enter phone number");
						String inp1 = in.next();
						String result1 = callfetch1.fetchdetails(inp1, "phone");
						if (result1 == "EXIST") {
							CheckDate a = new CheckDate();
							String s = a.TestDate(inp1);
						}
						break;
					default:
						System.out.println("wrong entry");
						break;
					}
				} catch (InvalidEmailidException e) {
					continue;

				} catch (InvalidPhonenumberException e) {

				}

				break;
			}
			case "3":
				entry = 0;
				break;
			default:
				System.out.println("enter valid number");

			}

		}

		in.close();

	}

}
