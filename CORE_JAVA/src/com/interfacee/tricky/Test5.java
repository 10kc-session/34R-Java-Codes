package com.interfacee.tricky;

interface Alpha{
	default void print() {
		System.out.println("Alpha interface");
	}
}
interface Beta{
	default void printer() {
		System.out.println("Beta Interface");
	}
}
class Tester implements Alpha,Beta{
	public void print() {
		Alpha.super.print(); // Beta.super.printer(); // A1.print() , B1.print()
		System.out.println("Alpha child method");
	}
	public void printer() {
		System.out.println("Beta Child method");
	}
}

public class Test5 {
	public static void main(String[] args) {
		Tester tester = new Tester();
		Alpha a = tester;
		Beta b = tester;
		
		a.print();
		b.printer();
		
	}
}
