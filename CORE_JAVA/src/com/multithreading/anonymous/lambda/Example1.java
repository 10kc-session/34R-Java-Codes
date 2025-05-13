package com.multithreading.anonymous.lambda;

class Demo extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public Demo(String str){
		super(str);
	}
}
public class Example1 {
	public static void main(String[] args) {
		Thread thread = new Demo("Hemanth");
		thread.start();
		thread.run();
//		thread.start(); // java.lang.IllegalThreadStateException
	}
}
