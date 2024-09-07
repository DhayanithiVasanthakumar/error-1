package com.emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String alternateemail;
	private String department;
	private int mailcapacity;
	
	/*
	 * constructors
	 */
	//To recive an firstname and last name.
	public Email(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("Email Created Sucessfully :"+this.firstname+" "+this.lastname);
		
		//call a method asking for the department return the department
		this.department=setDepartment();
		System.out.println("Department :"+" "+this.department);
	}
	
	//ask for a department from user
	
	private String setDepartment(){
		System.out.print("Department code\n1: for Sales\n2: for Development\n3: for Accounting\n0: for none\nEnter the Department code:");
		//to get department no form user
		Scanner in=new Scanner(System.in);
		int departmentChoice=in.nextInt();
		
		if(departmentChoice==1) {
			return "sales"; 
		}
		else if(departmentChoice==2) {
			return "Development";
		}
		else if(departmentChoice==3) {
			return "Accounting";
		}
		else 
			return "None";
		
	}
	
	//Generate a random password.
	
	//mail capacity
	
	//alternative email
	
	//change password
}
