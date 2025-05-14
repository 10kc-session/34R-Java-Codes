package com.multithreading.synchronization;

class Printer4 {
	public static synchronized void print(int n, String name) {
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

class User5 implements Runnable {

	@Override
	public void run() {
		Printer4.print(5, "Uttej");
	}

}

class User6 implements Runnable {

	@Override
	public void run() {
		Printer4.print(5, "Suresh");
	}
}

public class Main4 {
	public static void main(String[] args) {
		
		Runnable runnable = () -> Printer4.print(2, "ravi");
		
		User5 user1 = new User5();
		User6 user2 = new User6();

		Thread thread1 = new Thread(user1);
		Thread thread2 = new Thread(user2);

		thread1.start();
		thread2.start();
	}
}
