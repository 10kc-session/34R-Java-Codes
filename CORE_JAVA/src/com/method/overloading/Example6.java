package com.method.overloading;

public class Example6 {
	public void x(byte b) { System.out.println("Byte"); }
	public void x(short b) { System.out.println("Short"); }
	public void x(int b) { System.out.println("Int"); }
	public void x(long b) { System.out.println("Long"); }
	public void x(float b) { System.out.println("Float"); }
	public void x(double b) { System.out.println("Double"); }
	public void x(char b) { System.out.println("char"); }
	public void x(boolean b) { System.out.println("boolean"); }
	public void x(String b) { System.out.println("String"); }
	public void x(Example6 b) { System.out.println("Example6"); }
	
	public static void main(String[] args) {
	}
}
