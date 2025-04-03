package com.method.overloading;

public class Example7 {
	public static void main(String[] args) {
		System.out.println("Main method");
	}
	public static void main(String args) {
		System.out.println("Main");
	}
	public static void main(int a) {
		System.out.println("Main with int");
	}
}
