package com.bankapplication.main;

import com.bankapplication.BankAccount;

public class BankProcessor {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount("Sahithi", 123456, 50000);
		System.out.println("Current Balance : " + bankAccount.getBalance());
		bankAccount.deposit(5000);
		System.out.println("Updated Balance : " + bankAccount.getBalance());
		bankAccount.withdraw(35000);
		System.out.println("Updated Balance After Withdraw : " + bankAccount.getBalance());
	}
}
