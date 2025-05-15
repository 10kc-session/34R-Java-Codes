package com.multithreading.synchronization;

class BankAccount {
	int balance = 0;

	public synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName() + " is depositing amount of rs " + amount);
		balance += amount;
		System.out.println("Deposit Successfull updated amount : " + balance);
		notifyAll();
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " is withdrawing amount");
		while (amount > balance) {
			System.out.println(Thread.currentThread().getName() + " insufficient balance waiting for deposit...");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " has withdraw ," + amount);
		System.out.println("Updated balance after withdraw : " + balance);
	}
}

public class Main6 {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		Thread thread1 = new Thread(() -> {
			account.deposit(1000);
			account.deposit(1000);
			account.deposit(1000);
			account.deposit(1000);
			account.deposit(2500);
		}, "Deposit - Person");

		Thread thread2 = new Thread(() -> {
			account.withdraw(3000);
			account.withdraw(1000);
		}, "Withdraw - p1");

		Thread thread3 = new Thread(()->{
			account.withdraw(1000);
			account.withdraw(1000);
		}, "Withdraw - p2");
		
		thread2.start();
		thread3.start();
		thread1.start();
		
		try {
			thread2.join();
			thread1.join();
			thread3.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Final Balance : " + account.balance);
	}

}
