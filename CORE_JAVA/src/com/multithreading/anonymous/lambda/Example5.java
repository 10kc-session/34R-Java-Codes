package com.multithreading.anonymous.lambda;

public class Example5 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> System.out.println("Thread - 1"));

		Thread thread2 = new Thread(() -> System.out.println("Thread - 2"));

		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);

		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

		thread1.start();
		thread2.start();
		System.out.println("Main Ended...");
	}
}
