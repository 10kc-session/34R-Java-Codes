package com.blocks;

public class Demo2 {
	static{
		System.out.println("Static Block - 1");
	}
	{
		System.out.println("Non static block...");
	}
	Demo2(){
		System.out.println("Constructor called..");
	}
	static {
		System.out.println("Static Block - 2");
	}
	public static void main(String[] args) {
		System.out.println("Main Method..");
		new Demo2();
		System.out.println("Main Method - 2");
		new Demo2();
	}
}
