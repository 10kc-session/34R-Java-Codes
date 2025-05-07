package com.blocks;

class F{
	static int a = 10;
	static {
		System.out.println("Hello from F");
	}
}
class E{
	static {
		System.out.println("Hello from E");
	}
	public static void method1() {
		System.out.println("E class Method");
		System.out.println(F.a);
	}
}

public class Demo4 {
	public static void main(String[] args) {
		E.method1();
		System.out.println("Main Method ended...");
	}
}



