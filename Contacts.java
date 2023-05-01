package com.bridgelabz;

import java.util.Scanner;

public class Contacts {

	public String firstname, lastname, address, city, state, email;
	public int zipcode;
	public long phoneNumber;
	
	public Contacts() {
		super();
	}

	public Contacts(String firstname, String lastname, String address, String city, String state, String email, int zipcode,
			long phoneNumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.zipcode = zipcode;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zip) {
		this.zipcode = zipcode;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void getPersonDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First name: ");
		firstname = sc.next();
		System.out.println("Enter Last name: ");
		lastname = sc.next();
		System.out.println("Enter Address: ");
		address = sc.next();		
		System.out.println("Enter City: ");
		city = sc.next();
		System.out.println("Enter State: ");
		state = sc.next();
		System.out.println("Enter Email ID: ");
		email = sc.next();
		System.out.println("Enter Zipcode: ");
		zipcode = sc.nextInt();
		System.out.println("Enter Phone number: ");
		phoneNumber = sc.nextLong();
	}

	@Override
	public String toString() {
		return "Contacts [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", email=" + email + ", zipcode=" + zipcode + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
}