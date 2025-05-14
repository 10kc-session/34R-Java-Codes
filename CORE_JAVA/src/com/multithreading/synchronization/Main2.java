package com.multithreading.synchronization;

class Printer1{
	public void print(int n , String name) {
		for(int i = 1 ; i <= n ; i++) {
			System.out.println(name + " " + i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
public class Main2 {
	public static void main(String[] args) {
		Printer1 printer = new Printer1();
		
		Runnable user1 = () -> {
			synchronized (printer) {
				printer.print(5, "Ramu");
			}
		};
		
		Runnable user2 = () -> {
			synchronized (printer) {
				printer.print(5, "Rahul");
			}
		};
		
		Thread thread1 = new Thread(user1);
		Thread thread2 = new Thread(user2);
		
		thread1.start();
		thread2.start();
		
	}
}






