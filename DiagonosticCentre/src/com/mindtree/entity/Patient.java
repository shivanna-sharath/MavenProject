package com.mindtree.entity;

import java.sql.Date;

public class Patient {
	int pid;
	String name;
	String email;
	String phone;
	Date DOB;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(java.util.Date date) {
		System.out.println(date);
		DOB = (Date) date;
	}

}
