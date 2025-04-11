package com.interfacee.tricky;

class A1{
	public static void m1() {
		System.out.println("Hello World");
	}
}
class B1 extends A1{}

interface X1{
	public static void m2() {
		System.out.println("Hello World");
	}
}
class Y1 implements X1{}

public class Test3 {
	public static void main(String[] args) {
		A1.m1();
		B1.m1();
		
		X1.m2();
//		Y1.m2(); CE
	}
}
