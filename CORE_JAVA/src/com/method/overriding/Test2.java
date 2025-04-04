package com.method.overriding;

class X {
	private void printData() {
		System.out.println("Parent Class Method");
	}
}

class Y extends X {


	private  void printData() {
		System.out.println("Child class method");
	}
}

public class Test2 {
	public static void main(String[] args) {

	}
}
