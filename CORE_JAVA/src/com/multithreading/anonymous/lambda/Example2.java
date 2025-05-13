package com.multithreading.anonymous.lambda;

//class X implements Runnable{
//	public void run() {
//		System.out.println("Hello World");
//	}
//}

public class Example2 {
	public static void main(String[] args) {
		Runnable run = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};

		Runnable run2 = () -> System.out.println(Thread.currentThread().getName());

		Thread thread = new Thread(run, "First");
		Thread thread2 = new Thread(run2, "Second");
		thread.start();
		thread2.start();
	}
}
