package com.method.overloading;

class C{}
class D extends C{}
class E extends D{}

public class Example5 {
	public static void method(C c) {
		System.out.println("C class Object");
	}

	public static void method(D e) {
		System.out.println("D class Object");
	}
	public static void main(String[] args) {
		C c = new E();
		D d = (D) c;
		method(d);
	}
}





