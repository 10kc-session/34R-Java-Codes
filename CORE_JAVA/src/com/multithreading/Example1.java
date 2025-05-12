package com.multithreading;

class A extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class Example1 {
	public static void main(String[] args) {
		// Main Thread 
		System.out.println("Main Method..");
		System.out.println(Thread.currentThread().getName());
		
		Thread thread1 = new A();
		Thread thread2 = new A();
		
		thread1.start(); // new Thread is created
		thread2.start(); // new Thread is created
		
		
		System.out.println("Main Method Ended....");
	}
}
