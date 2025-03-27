package com.constructor.chaining;

class Parent{
	String name = "Java is Awesome from Parent";
	
	public void display() {
		System.out.println(name);
	}
}
class Child extends Parent{
	String name = "Java is Awesome from child";

	public void display() {
//		super.display();
		System.out.println(super.name);
	}
}
public class Example3 {
	public static void main(String[] args) {
		Child child = new Child();
		child.display();
	}
}



