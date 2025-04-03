package com.method.overloading;

class A {
	public void method(String str) {
		System.out.println("Parent");
	}
}
class B extends A{
	public void method(int a) {
		System.out.println("Child");
	}
}
public class Example4 {
	public static void main(String[] args) {
		B b = new B();
		b.method(10);
		b.method("Hello");
	}
}



