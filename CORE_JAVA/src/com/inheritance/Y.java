package com.inheritance;

// Child 
public class Y extends X {
	
	public void meth2() {
		System.out.println("Y");
	}
	
	public static void main(String[] args) {
		X x = new Y();
		Y y = (Y)x;
		System.out.println(y.a);
		y.meth1();
		y.meth2();
	}
}
