package com.exceptions;

public class BankAccountScenario {

	public static void main(String[] args) {
	BankAccount ba=new BankAccount(1000);
	
	try {
		ba.performTransaction(0);
	}
	catch(InvalidTransactionException e) {
		e.printStackTrace();
	}
	System.out.println("------------");
	try {
		ba.withdraw(-1);
	}
	catch(InsufficientFundsException e) {
		e.printStackTrace();
	}
	catch(IllegalArgumentException e) {
		e.printStackTrace();
	}
	
	
	}

}
