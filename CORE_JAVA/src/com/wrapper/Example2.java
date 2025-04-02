package com.wrapper;

public class Example2 {
	public static void manualUnBoxing() {
		Integer i1 = 10; // auto boxing 
		// if we to perform manual unboxing we use xxxValue();
		int i = i1.intValue(); // manual unboxing 
		System.out.println(i);
	}
	public static void autoUnboxing() {
		Integer i1 = 10;
		int i = i1; // auto unboxing 
		System.out.println(i);
	}
	public static void main(String[] args) {
		manualUnBoxing();
		autoUnboxing();
	}
}

