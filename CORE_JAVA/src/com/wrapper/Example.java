package com.wrapper;

public class Example {
	public static void manualBoxing() {
		int a = 10; // primitive 
		Integer i1 = Integer.valueOf(a); // Manual Boxing (before 1.5)
		System.out.println(i1.toString());
		
		// Manual Boxing 
		Integer i2 = new Integer(10); // before java 1.9 (not recommended)  
		System.out.println(i2);
		
		Integer i3 = new Integer(30);
		Integer i4 = new Integer(30);
		System.out.println(i3 == i4);
		
		Integer i5 = 300;
		
	}
	
	public static void autoBoxing() {
		int a = 10;
		Integer i1 = a; // after 1.5 Auto boxing
		System.out.println(i1);
		
		Integer i2 = 10;
		System.out.println(i2);
		
		Integer i3 = 127;
		Integer i4 = 127;
		
		Integer i5 = 1000; // 100x
		Integer i6 = 1000; // 101x
		
		System.out.println(i3 == i4);
		System.out.println(i5 == i6);
	}
	
	public static void main(String[] args) {
//		autoBoxing();
		manualBoxing();
	}
}