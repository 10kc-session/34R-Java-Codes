package com.multithreading.synchronization;

class Printer{
	public void print(int n , String name) {
		for(int i = 1 ; i <= n ; i++) {
			System.out.println(name + " - " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class User1 implements Runnable{
	
	Printer printer;
	
	public User1(Printer printer) {
		this.printer = printer;
	}
	
	public void run() {
		synchronized (printer) {
			printer.print(5, "Rahul");
		}
	}
}

class User2 implements Runnable{
	
	Printer printer;
	
	public User2(Printer printer) {
		this.printer = printer;
	}
	
	public void run() {
		synchronized (printer) {
			printer.print(5, "Ramu");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		User1 user1 = new User1(printer);
		User2 user2 = new User2(printer);
		
		Thread thread1 = new Thread(user1);
		Thread thread2 = new Thread(user2);
		
		thread1.start();
		thread2.start();
		
	}
}










