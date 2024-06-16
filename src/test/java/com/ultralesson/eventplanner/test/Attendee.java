package com.ultralesson.eventplanner.test;

public class Attendee {
	public Attendee(int id, String firstName, String lastName, String email) {
		// TODO Auto-generated constructor stub
		this.email=email;
		this.firstName=firstName;
		this.lastName=lastName;
		this.id=id;
	}


	public int id=1;


	public String firstName = "John";


		public String lastName = "Doe";


	public String  email = "john.doe@example.com";


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}



}
