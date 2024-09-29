package com.project.studentApp.main;

import java.util.Scanner;

import com.project.studentApp.model.Student;
import com.project.studentApp.dataAccess.*;


public class User {

	public static void main(String[] args) {
		
		StudentDataInterface accessObj=new StudentData();
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to student Management application system");

		while(true) {
			System.out.println("\n1.Add Student"+"\n2.Show All Student"+
								"\n3.Get Student based on roll number"+
								"\n4.Delete Student"+"\n5.Update Student"+
								"\n6.Exit");
			
			System.out.println("Enter your choice");
			int choice=input.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("add student");
				
				System.out.println("Enter Roll number: ");
				int rollNum=input.nextInt();
				
				System.out.println("Enter student name: ");
				String name=input.next();
				
				System.out.println("Enter Student college name: ");
				String collegeName=input.next();
				
				System.out.println("Enter city: ");
				String city=input.next();
				
				System.out.println("Enter Student percentage: ");
				double percentage=input.nextDouble();
				
				
				
				Student stu=new Student(rollNum,name,collegeName,city,percentage);
				
				boolean result=accessObj.insertStudent(stu);
				if(result) {
					System.out.println("Record added sucessfully...");
				}else {
					System.out.println("Something went Wrong! Please try again");
				}
				break;
			case 2:
				System.out.println("show all student");
				accessObj.showAllStudents();
				break;
			case 3:
				System.out.println("get student based on roll number");
				System.out.println("Enter roll number: ");
				int rollnumber=input.nextInt();
				boolean checkRoll=accessObj.showStudentByID(rollnumber);
				if(!checkRoll) {
					System.out.println("Student with this ID not available in DataBase");
				}
				break;
			case 4:
				System.out.println("delete student");
				System.out.println("Enter roll number to delete student: ");
				int rollNumDelete = input.nextInt();
				boolean deleteRoll=accessObj.delete(rollNumDelete);
				if(deleteRoll) {
					System.out.println("Record Deleted sucessfully.");
				}else {
					System.out.println("Record Deleted unsucessfully");
				}
				break;
			case 5:
				System.out.println("update student");
				
				System.out.println("\n1.update name\n2.update college name\n3.update city\n4.update percentage");
				System.out.println("Enter your choice:");
				int choices=input.nextInt();
				
				switch(choices) {
				case 1:
					System.out.println("Enter  roll number: ");
					int studentrollnumber=input.nextInt();
					
					System.out.println("Enter new name: ");
					String newName=input.next();
					
					Student st=new Student();
					st.setName(newName);
					
					boolean flag=accessObj.update(studentrollnumber, newName, choices, st);
					
					if(flag) {
						System.out.println("Name updated sucessfully");
					}else {
						System.out.println("name update unsucessfull");
					}
					
				}
				
				
				
				
				
				
				break;
			case 6:
				System.out.println("Thankyou for using application");
				System.exit(0);
			default:
				System.out.println("invalid choice");
			}
		}
	}

}
