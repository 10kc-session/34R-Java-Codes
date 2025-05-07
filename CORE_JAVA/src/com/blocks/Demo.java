package com.blocks;

public class Demo {
	static int a;
	static {
		a = 10;
		System.out.println("Static Block - 1");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println(a);
	}
	
	static {
		System.out.println("Static Block - 2");
		a = 40;
	}
}