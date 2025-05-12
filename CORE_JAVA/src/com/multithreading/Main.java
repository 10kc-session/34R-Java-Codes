package com.multithreading;

class Display1 implements Runnable{
	
	@Override
	public void run()
	{
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
		}
	}
}

class Display2 implements Runnable{
	@Override
	public void run() {
		for(int i = 100 ; i <= 105 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
		}	
	}
}

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		Display1 obj1 = new Display1();
		Display2 obj2 = new Display2();
		
		Thread thread1 = new Thread(obj1);
		Thread thread2 = new Thread(obj2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("Main method ended...");
				
	}
}





