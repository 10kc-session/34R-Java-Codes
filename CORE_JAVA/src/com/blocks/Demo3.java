package com.blocks;

class A{
	static {
		System.out.println("A class SB");
	}
	{
		System.out.println("A class NSB");
	}
}
class B extends A{
	static {
		System.out.println("B class SB");
	}
	{
		System.out.println("B class NSB");
	}
}
public class Demo3 {
	public static void main(String[] args) {
		new B();
	}
}

