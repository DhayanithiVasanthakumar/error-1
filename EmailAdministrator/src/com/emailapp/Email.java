package com.emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private int defaultPasswordLength=10;
	private String email;
	private String alteremail;
	private String department;
	private int mailcapacity=500;
	private String companySuffix="sat.com";
	
	/*
	 * constructor
	 */
	//To recive an firstname and last name.
	public Email(String firstname,String lastname) {
		this.firstname=firstname;
		this.lastname=lastname;
		//System.out.println("Email Created Sucessfully :"+this.firstname+" "+this.lastname);
		
		
		//call a method asking for the department return the department
		this.department=setDepartment();
		//System.out.println("Department :"+" "+this.department);
		
		
		//call a method to generate a random password
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("\nYour password is :"+this.password);
		
		
		//combine elements to generate a email.
		email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySuffix;
		//System.out.println("your email is :"+email);
		
	}
	
	
	
	
	/*
	 * methods
	 */
	//ask for a department from user
	private String setDepartment(){
		System.out.print("New Worker :"+firstname+"\nDepartment codes\n1: Sales\n2: Development\n3: Accounting\n0: none\nEnter the Department code:");
		//to get department number form user
		Scanner in=new Scanner(System.in);
		int departmentChoice=in.nextInt();
		
		if(departmentChoice==1) { return "sales"; }
		else if(departmentChoice==2) { return "Development"; }
		else if(departmentChoice==3) { return "Accounting"; }
		else 
			return "None";
	}
	
	
	
	//Generate a random password.
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$";
		char[] password =new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	
	/*
	 * set methods
	 */
	//set the mail capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailcapacity=capacity;
	}
	
	
	//set the alternative email
	public void setAlternativeEmail(String alternateEmail) {
		this.alteremail=alternateEmail;
	}
	
	
	
	//change password
	public void setPassword(String changedpassword) {
		this.password=changedpassword;
	}
	
	
	
	//get methods in main file.
	public int getmailBoxCapacity() { return mailcapacity; }
	
	public String getAlternativeEmail() { return alteremail; }
	
	public String getPassword() { return password; }
	
	
	//Shoe all information in single method.
	public String showInfo() {
		return "DISPLAY NAME :"+firstname+" "+lastname+
				"\nCOMPANY EMAIL :"+email+
				"\nMAILBOX CAPACITY :"+mailcapacity+"mb";
	}
}
