package com.anonymous;

class Parent{
	public void job() {
		System.out.println("Doing job...");
	}
}
//class Child extends Parent{
//	@Override
//	public void job() {
//		System.out.println("SF Job");
//	}
//}

public class Main {
	public static void main(String[] args) {
		
		// class Anonymous Extends Parent
		// Parent parent = new Anonymous(); // Dynamic Method Dispatch
		Parent parent = new Parent() {
			@Override
			public void job() {
				System.out.println("SF Job");
			}
		};
		parent.job();
	}
}





