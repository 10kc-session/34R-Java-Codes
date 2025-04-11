package com.interfacee.tricky;

interface A{
	String getDetails(); // public abstract 
}
interface B{
	boolean isEven(int num);
}
class C implements A , B{
	@Override
	public String getDetails() {
		return "My Name is B class";
	}
	@Override
	public boolean isEven(int num) {
		return num % 2 == 0;
	}
}

public class Test {
	public static void main(String[] args) {
		C c = new C();
		
//		Dynamic method dispatch -> method overriding 
		A a = c;
		B b = c;
		
		System.out.println(a.getDetails());
		System.out.println(b.isEven(40));
	}
}
