package com.multithreading.anonymous.lambda;

public class Example3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Method Started...");
		
		Thread thread1 = new Thread(() -> System.out.println("Thread - 1"));
		Thread thread2 = new Thread(()->System.out.println("Thread - 2"));
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println("Main Method Ended");
		
	}
}
