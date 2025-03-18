package com.thiskeyword;

public class X {
	
	public void printThis() {
		System.out.println(this); // 100x 200x
	}
	
	public static void main(String[] args) {
		X x1 = new X(); 
		System.out.println("----------x1 Object-------");
		System.out.println(x1); // 100x
		x1.printThis();
		
		System.out.println("---------x2 Object---------");
		
		X x2 = new X();
		System.out.println(x2); // 200x
		x2.printThis();     
	}
}



