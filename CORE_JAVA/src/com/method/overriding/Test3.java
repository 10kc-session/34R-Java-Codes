package com.method.overriding;

class A {
	void method() {System.out.println("A class Method");}
}
class B extends A {
	void method() {System.out.println("B class Method");}
}
class Afactory {
	public A getObject() {return new A();}
}
class Bfactory extends Afactory {
	@Override
	public B getObject() {return new B();}
}
public class Test3 {
	public static void main(String[] args) {
					Bfactory factory = new Bfactory();
					B b = factory.getObject();
					b.method();
			
					Afactory afact = new Afactory();
					A a = afact.getObject();
					a.method();
	}
}
