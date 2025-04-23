package test;

abstract class X{
	abstract void method();
}

public class TestDemo {
	public static void main(String[] args) {
		X x = new X() {
			public void method() {
				System.out.println("Hello World");
			}
		};
	}
}
