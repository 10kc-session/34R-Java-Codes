package com.method.overloading;

public class Example2 {
	
//	public void print(int a) {
//		System.out.println("int : " + a);
//	}
	
//	public void print(long a) {
//		System.out.println("long : " + a);
//	}
	
//	public void print(byte a) {
//		System.out.println("byte : " + a);
//	}
	
//	public void print(float a) {
//		System.out.println("float : " + a);
//	}
//	
//	public void print(double a) {
//		System.out.println("double : " + a);
//	}
	
	public void print(float a) {
		System.out.println("float : " + a);
	}
	
//	Integer i = 10; // Autoboxing
	public void print(Integer i) {
		System.out.println("Integer : " + i);
	}
	public static void main(String[] args) {
//		new Example2().print(30.05);
	}
}


