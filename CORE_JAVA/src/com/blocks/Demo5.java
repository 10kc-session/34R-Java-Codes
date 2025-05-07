package com.blocks;

class C{
	static final int a;
	int b;
	static {
		a = 10;
		System.out.println("Static Block...");
	}
	{
		b = 39;
		System.out.println("Non static block - 1");
	}
	public C() {
		System.out.println("Constructor Called");
	}
	{
		b = 54;
		System.out.println("Non static block - 2");
	}
	public void m1() {
		System.out.println("Method called...");
	}
}
public class Demo5 {
	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new C();
		c1.m1();
		new C().m1();
		c2.m1();
	}
}
