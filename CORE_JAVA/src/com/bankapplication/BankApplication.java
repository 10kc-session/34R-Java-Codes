package com.bankapplication;

public class BankApplication {
	private String customerName;
	private String customerAddress;
	private long phoneNumber;
	private double balance;

	/**
	 * @param customerName
	 * @param customerAddress
	 * @param phoneNumber
	 * @param balance
	 */
	public BankApplication(String customerName, String customerAddress, long phoneNumber, double balance) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		System.out.println("Account created succesfull");
//		FAQ -> why does compiler gives default constructor ?
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid Deposit Amount");
		} else {
			this.balance += amount;
			System.out.println("Deposit Successfull, Updated balance : " + this.balance);
		}
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid withdrawal amount");
		} else if (amount > balance) {
			System.out.println("Insufficient funds");
		} else {
			this.balance -= amount;
			System.out.println("Withdraw successful , updated amount : " + this.balance);
		}
	}

	public void showBalance() {
		System.out.println("Your current balance is " + this.balance);
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerAddress
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}

	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	/**
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
