package com.exceptions;

public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	void performTransaction(double amount)throws  InvalidTransactionException{
		if(amount<=0) {
			throw new InvalidTransactionException("Negative Or Zero Not Allowed");
		}
		else {
			this.balance+=amount;
			System.out.println("Current Balance "+balance);
		}
	}
	void withdraw(double amount) {
		if(amount>balance) {
			throw new InsufficientFundsException("In sufficient Balance");
		}
		else if(amount<=0) {
			throw new IllegalArgumentException("In Valid Amount");
		}
		else {
			this.balance=balance-amount;
			System.out.println(balance);
		}
	}
	
}
