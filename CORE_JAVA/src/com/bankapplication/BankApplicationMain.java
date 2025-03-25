package com.bankapplication;

import java.util.Scanner;

public class BankApplicationMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String customerName = scanner.nextLine();
		System.out.print("Enter your address : ");
		String customerAddress = scanner.nextLine();
		System.out.print("Enter your phone number : ");
		long phoneNumber = scanner.nextLong();
		System.out.print("Enter your deposit amount : ");
		double initialDeposit = scanner.nextDouble();
		BankApplication application = new BankApplication(customerName, customerAddress, phoneNumber, initialDeposit);
		boolean status = true;
		
		while(status) {
			System.out.println("**** Select an Option from Below **** \r\n" + "1. Withdraw \r\n" + "2. Deposit \r\n"
					+ "3. Show Balance \r\n" + "4. Exit \r\n" + "Enter your option [1-4]:");
			int option = scanner.nextInt();
			switch (option) {
			case 1: {
				System.out.print("Enter Withdraw amount : ");
				double amount = scanner.nextDouble();
				application.withdraw(amount);
				break;
			}
			case 2: {
				System.out.print("Enter Deposit amount : ");
				double amount = scanner.nextDouble();
				application.deposit(amount);
				break;
			}
			case 3: {
				application.showBalance();
				break;
			}
			case 4: {
				System.out.println("Thank You !");
				status = false;
				break;
			}

			default:
				System.out.println("Invalid option");

			}
		}
		
		scanner.close();
	}
}
