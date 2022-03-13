package com.Great_Learning_Lab.Entity;

public class Employee {
	private String Firstname;
	private String Lastname;

	public Employee(String firstname, String lastname) {

		this.Firstname = firstname;
		this.Lastname = lastname;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

}
