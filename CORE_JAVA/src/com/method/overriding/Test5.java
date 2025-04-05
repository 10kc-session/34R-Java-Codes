package com.method.overriding;

class SuperClass{
	public Object getObject() {return new Object();}
}
class SubClass extends SuperClass{
	public String getObject() {return new String("Hello World");}
}
public class Test5 {
	public static void main(String[] args) {
		SuperClass superObj = new SubClass();
		System.out.println(superObj.getObject()); // Hello World
		
		SuperClass superClass = new SuperClass();
		System.out.println(superClass.getObject()); // xyz output 
		
					SubClass subClass = new SubClass();
					System.out.println(subClass.getObject());  // Hello World
		
		System.out.println((Object)subClass.getObject());
	}
}
