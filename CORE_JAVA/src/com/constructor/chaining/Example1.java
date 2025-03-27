package com.constructor.chaining;

public class Example1 {
	
	public Example1() {
		this(10 , 30); // calling parameterized constructor
	}
	public Example1(int a , int b) {
		this(10 , "Hello World");
		System.out.println("Parameterized Constructor");
		System.out.println(a + b);
	}
	public Example1(int a , String str) {
		System.out.println(a + " " + str);
	}
	public static void main(String[] args) {
		new Example1();
	}
}
