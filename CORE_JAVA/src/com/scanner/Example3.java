package com.scanner;

import java.util.Scanner;

public class Example3 {
	/**
	 * 	validate the user by taking username and password 
	 * 	"admin" , "admin@123"
	 * 	take input from user ask username and password
	 * 		if username or password does not match show invalid password 
	 * 	i/p : 
	 * 			Enter your username : admin
	 * 			Enter your password : admin@123
	 *  o/p : login success
	 * 	
	 * 	i/p: 
	 * 		    Enter your username : user
	 * 			Enter your password : user@123
	 *  o/p : login failed 
	 *  
	 *  give user only three chances to enter the username and password
	 *  
	 *  	in first try if he/she is wrong ask again 
	 *  	in second try if he/she is wrong ask again 
	 *  	in third third he/she is wrong then terminate
	 *  
	 *   hint : do while
	 *  		
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int attempts = 0;
		
		do {
			System.out.print("Enter username : ");
			String username = scanner.nextLine();
			System.out.print("Enter password : ");
			String password = scanner.nextLine();
			
			if(username.equals("admin") && password.equals("admin@123")) {
				System.out.println("Login Successfull");
				break;
			}
			else {
				attempts++;
				System.out.println("\nLogin Failed, " + (3 - attempts) + " attempt(s) are left\n");
			}
			
		}while(attempts < 3);
		
		if(attempts == 3) {
			System.out.println("Your account has been blocked for 24 hours");
		}
		
		scanner.close();
	}
}









