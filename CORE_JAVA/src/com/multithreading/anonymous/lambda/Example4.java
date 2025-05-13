package com.multithreading.anonymous.lambda;

class Counter{
	int count;
	
	void increment() {
		System.out.println(count);
		
		synchronized (this) {
			count++;
		}
		
	}
	
	int getCount() {
		return count;
	}
}

public class Example4 {
	
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		
		Thread thread1 = new Thread(() -> {
			for(int i = 1 ; i <= 1000 ; i++) {
				counter.increment();
			}
		} , "Thread - 1");
		
		Thread thread2 = new Thread(() -> {
			for(int i = 1 ; i <= 1000 ; i++) {
				counter.increment();
			}
		} , "Thread - 2");
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println("Total Count : " + counter.getCount());
	}
}





