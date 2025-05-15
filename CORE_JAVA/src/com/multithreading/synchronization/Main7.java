package com.multithreading.synchronization;

class X{
	public static void print() {
		System.out.println("Hello There");
	}
}

public class Main7 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(X::print);
		thread1.run();
	}
}
