package com.interfacee.tricky;

interface X{
	void meth();
}
interface Y{
	void meth();
}

class F implements X , Y{
	public void meth() {
		System.out.println("Hello World");
	}
}
public class Test2 {
	public static void main(String[] args) {
		Y y = new F();
		y.meth();
	}
}
