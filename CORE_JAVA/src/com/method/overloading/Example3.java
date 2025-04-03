package com.method.overloading;

public class Example3 {
	public void x(Integer i) {
		System.out.println("Integer");
	}
	public void x(String str) {
		System.out.println("String");
	}
	public static void main(String[] args) {
//		new Example3().x(null);
	}
}
