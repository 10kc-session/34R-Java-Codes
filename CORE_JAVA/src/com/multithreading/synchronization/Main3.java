package com.multithreading.synchronization;

class Printer3 {
	public synchronized void print(int n, String name) {
		for (int i = 1; i <= n; i++) {
			System.out.println(name + " " + i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class User3 implements Runnable {
	Printer3 printer;

	public User3(Printer3 printer) {
		this.printer = printer;
	}

	@Override
	public void run() {
		printer.print(5, "Uttej");
	}

}

class User4 implements Runnable {
	Printer3 printer;

	public User4(Printer3 printer) {
		this.printer = printer;
	}

	@Override
	public void run() {
		printer.print(5, "Suresh");
	}
}

public class Main3 {
	public static void main(String[] args) {
		Printer3 printer = new Printer3();

		User3 user1 = new User3(printer);
		User4 user2 = new User4(printer);

		Thread thread1 = new Thread(user1);
		Thread thread2 = new Thread(user2);

		thread1.start();
		thread2.start();
	}
}
