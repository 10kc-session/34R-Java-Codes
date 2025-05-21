package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class BankAccount {
	double balance;
	private static final File file = new File("userdata.txt");

	public void login(String username, String password) {
		try (FileReader fr = new FileReader(file); BufferedReader reader = new BufferedReader(fr);) {
			String user;
			boolean isAvailable = false;
			while ((user = reader.readLine()) != null) {
				String[] userDetails = user.split(",");
				if (username.equals(userDetails[0]) && password.equals(userDetails[1])) {
					isAvailable = true;
					break;
				}
			}
			if (isAvailable) {
				System.out.println("Login Successfull..");
			} else {
				System.out.println("Login Failed..");
			}
		} catch (IOException e) {
			System.out.println("Something went wrong : " + e.getMessage());
		}
	}

	public void register(String username, String password) {
		try (FileWriter writer = new FileWriter(file, true);) {
			String userData = username + "," + password + "," + balance + "\n";
			writer.write(userData);
			System.out.println("Registration Succesfull....");
		} catch (IOException e) {
			System.out.println("Something went wrong : " + e.getMessage());
		}
	}
}

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		try (Scanner scanner = new Scanner(System.in);) {
			while (true) {
				System.out.println("-----Welcome to 34r Bank---\r\n" + "1. Login\r\n" + "2. Register\r\n" + "3. Exit\r\n"
						+ "Choose one option [1-3]:");
				int option = scanner.nextInt();
				scanner.nextLine();
				switch (option) {
				case 1 -> {
					System.out.print("enter username : ");
					String username = scanner.nextLine().trim();

					System.out.print("enter password : ");
					String password = scanner.nextLine().trim();

					account.login(username, password);
				}
				case 2 -> {
					System.out.print("enter username : ");
					String username = scanner.nextLine().trim();

					System.out.print("enter password : ");
					String password = scanner.nextLine().trim();

					account.register(username, password);

				}
				case 3 -> {
					System.out.println("Bye Bye");
					System.exit(0);
				}
				}
			}

		}
	}

}
