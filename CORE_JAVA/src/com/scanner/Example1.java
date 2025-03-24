package com.scanner;

import java.util.Scanner;

public class Example1 {
	
	public void displayDetails(String name , String address , int pincode , long phno) {
		System.out.println("Your Name : " + name);
		System.out.println("Your Address : " + address);
		System.out.println("Your Pincode : " + pincode);
		System.out.println("Your Phno : " + phno);
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = scanner.nextLine();
		System.out.print("Enter your address : ");
		String address = scanner.nextLine();
		System.out.print("Enter your pincode : ");
		int pincode = scanner.nextInt();
		System.out.print("Enter your phone number : ");
		long phno = scanner.nextLong();
		
		new Example1().displayDetails(name, address, pincode, phno);
		
		
		
		
		scanner.close();
	}
}
