package com.interfacee.tricky;

interface X2{
	default void method1() {
		System.out.println("Method X2");
	}
}
interface Y2{
	default void method1() {
		System.out.println("Method Y2");
	}
}

class Z2 implements X2 , Y2{
	public void method1() {
		Y2.super.method1();
	}
}
public class Test6 {
	public static void main(String[] args) {
		Z2 z2 = new Z2();
		z2.method1();
	}
}
