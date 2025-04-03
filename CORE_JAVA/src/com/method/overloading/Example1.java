package com.method.overloading;

public class Example1 {
	public void add(short a , short b) {
		System.out.println("Short : "  + (a + b));
	}
	public void add(int a , int b) {
		System.out.println("Integer : "  +  (a + b));
	}
	public void add(double a , double b) {
		System.out.println("Double : "  +  (a + b));
	}
	public void add(float a , float b) {
		System.out.println("Float : " + (a + b));
	}
	public static void main(String[] args) {
		Example1 obj = new Example1();
//		obj.add(10.345f, 10.0f);
		short s1 = 1;
		int s2 = 1;
		obj.add(s1 , s2);
	}
}
