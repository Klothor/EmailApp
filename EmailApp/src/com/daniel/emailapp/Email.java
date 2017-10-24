package com.daniel.emailapp;

import java.util.Scanner;

public class Email {

	private String name;
	private String firstName;
	private String lastName;
	private String pass;
	private String department;
	private int capacity = 500;
	private String altEmail;
	private String compSuff = ".company.com";

	// Constructor
	public Email(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("New email: " + this.firstName + " " + this.lastName);

		// call method to get department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//rand pass
		this.pass = randomPass(10);
		System.out.println("Your password is: " + this.pass);
		
		//email name
		this.name = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + this.compSuff;
		System.out.println("Yout email is: " + this.name);

	}

	// Get department from user ad set it
	private String setDepartment() {
		System.out.println("Enter department:\n1 - Sales\n2 - Development\n3 - Accounting\n0 - none");
		Scanner in = new Scanner(System.in);
		int d = in.nextInt();
			if (d == 1) {
				return "sales";
			} else if (d == 2) {
				return "dev";
			} else if (d == 3) {
				return "acct";
			} else {
				return "";
			}
	}
	
	//Generate random pass
	private String randomPass(int length){
		String passSet = "1234567890qwertyuioplkjhgfdsazxcvbnmMNBVCXZASGHJKLPOIUYEWQ";
		char[] pass = new char[length];
		for (int i = 0; i < pass.length; i++) {
			int rand = (int) (Math.random() * passSet.length());
			pass[i] = passSet.charAt(rand);
		}
		
		return new String(pass);
	}
	
	//set capaciy
	public void setCapacity(int cap){
		this.capacity = cap;
	}
	
	//set alt email
	public void setAltEmail(String email){
		this.altEmail = email;
	}
	
	//change password
	public void changePassword(String newPass){
		this.pass = newPass;
	}
	
	public String getName(){
		return this.firstName + " " + this.lastName;
	}
	
	public String getEmail(){
		return this.name;
	}
	
	public int getCapacity(){
		return this.capacity;
	}
	
	

}
