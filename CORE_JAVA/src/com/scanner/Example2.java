package com.scanner;

import java.util.Scanner;

public class Example2 {
	/**
	 * Take input from user and validate the age and gender if age > 23 and gender
	 * is female or age > 25 and gender is male show eligible for marraige or not
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = scanner.nextInt();
		System.out.print("Enter you gender : ");
		String gender = scanner.next();

		if ((age > 23 && gender.equals("Female")) || (age > 25 && gender.equals("Male"))) {
			System.out.println("Eligible for voting");
		} else {
			System.out.println("! Eligible");
		}

		scanner.close();
	}
}
