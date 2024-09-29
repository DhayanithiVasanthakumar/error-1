package com.project.atmApp;

import java.util.ArrayList;

public class User {
	
	//The First Name of the user.
	private String firstName;
	
	//The Last Name of the user.
	private String lastName;
	
	//The ID number of user.
	private String userID;
	
	//The MD5 hash of user pin number
	private byte pinHash[];
	
	//The list of Accounts for user.
	private ArrayList<Account> accounts;
	
	
}
