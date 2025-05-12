package com.multithreading;

class B extends Thread{
	public void run() {
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println(Thread.currentThread()
					.getName() + " - " + i);
		}
	}
}

public class Example2 {
	public static void main(String[] args) {
		System.out.println("Main Method Started...");
		
		Thread thread1 = new B();
		Thread thread2 = new B();
		
		thread1.start();
		thread2.start();
		
		System.out.println("Main Method Ended...");
	}
}
