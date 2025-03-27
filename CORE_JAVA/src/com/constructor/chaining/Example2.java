package com.constructor.chaining;

//class X {
//	public X(int a) {
//		System.out.println(a);
//	}
//	public X() {
//		this(20);
//		System.out.println("No Parameterized");
//	}
//}
//
//class Y extends X {
//	public Y() {
//		this("Java is Awesome");
//		System.out.println("Child Constructor");
//	}
//	public Y(String str) {
//		super();
//		System.out.println(str);
//	}
//}
// 20 , no parem , java is awesome , child cons
// java is aea , 20 no p , chil
//class X {
//	int a;
//	public X(int a) {
//		this.a = a;
//		System.out.println("X constructor");
//	}
//}
//class Y extends X {
//	public Y(int a) {
//		super(a);
//		System.out.println("Y constructor");
//	}
//}
//
//class Z extends Y {
//	public Z() {
//		super(10);
//		System.out.println("Z constructor");
//	}
//}

class Bicycle {
	String tyre;
	String handle;
	String chain;
	String brakes;

	public Bicycle() {
	}

	public Bicycle(String tyre, String handle, String chain, String brakes) {
		this.tyre = tyre;
		this.handle = handle;
		this.chain = chain;
		this.brakes = brakes;
		
		System.out.println("Bicylce Object Created");
	}

	public void startMoving() {
		System.out.println("Bicycle started moving");
	}

	public void applyBrakes() {
		System.out.println("Applying brakes.....");
	}
}

class Bike extends Bicycle {
	String engine;
	String mileage;
	String headLight;
	public Bike(String tyre, String handle, String chain, String brakes, 
			String engine, String mileage,
			String headLight) {
		super(tyre , handle , chain , brakes);
		this.engine = engine;
		this.mileage = mileage;
		this.headLight = headLight;
		
		System.out.println("Bike Object Created");
	}
	
	public void startMoving() {
		System.out.println("Accelerating Bike.....");
	}
	
	public void applyBrakes() {
		System.out.println("Bike Applying Brakes");
	}
}

public class Example2 {
	public static void main(String[] args) {
		Bike bike = new Bike("MRF tyres", "Cafe Rider Handle", "Metal", "Disc", "Petrol engine 35hp", "35", "LED headlights");
		bike.startMoving();
		bike.applyBrakes();
	}
}
