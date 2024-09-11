package com.emailapp;

import java.util.Scanner;

public class EmailApp {
	public static void main(String[]args) {
		
		Scanner in=new Scanner(System.in);
		//user information
		System.out.println("Enter firstname: ");
		String fname=in.next();
		System.out.println("Enter lastname: ");
		String lname=in.next();
		
		
		//create obj for Email class
		Email em=new Email(fname,lname);
		//  why -1 ->because we use (flag) true/false  true represent 1,false represent 0 in Email class
		//invoke it again and again
		int choice=-1;
		do {
			System.out.println("\n *******\nEnter Choice: \n1 show information\n2 change password\n3 change mailbox capacity\n4 set alternative mail\n5 Exit");
			choice=in.nextInt();
			switch(choice) {
			case 1:
				em.showInfo();
				break;
			case 2:
				em.setPassword();
				break;
			case 3:
				em.setMailBoxCapacity();
				break;
			case 4:
				em.setAlternateEmail();
				break;
			case 5:
				System.out.println("Thankyou for using Application");
				break;
			default:
				System.out.println("Invalid choice,please enter valid choice");
			}
		}while(choice!=5);

	}
}
