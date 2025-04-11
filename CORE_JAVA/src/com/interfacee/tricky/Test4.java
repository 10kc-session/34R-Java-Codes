package com.interfacee.tricky;

interface C1{
	static void print() {
		System.out.println("C1 Interface");
	}
}
interface D1{
	static void print() {
		System.out.println("D1 Interface");
	}
}
class F1 implements C1 , D1{
	public void print() {
		System.out.println("Child class Print");
		D1.print();
		C1.print();
	}
}

public class Test4 {
	public static void main(String[] args) {
		F1 f1 = new F1();
		f1.print();
	}
}
