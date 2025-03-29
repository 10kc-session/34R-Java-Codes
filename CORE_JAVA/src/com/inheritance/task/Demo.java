package com.inheritance.task;

class AudiCar{
	String color;
	String brand;
	String model;
	Engine engine; // Has a Relation 
	public AudiCar(String color, String brand, String model, Engine engine) {
		this.color = color;
		this.brand = brand;
		this.model = model;
		this.engine = engine;
	}	
	public void start() {
		System.out.println("Engine Started....");
	}
	public void stop() {
		System.out.println("Engine stopped....");
	}
	
	public String toString() {
		return "AudiCar [color=" + color + ", brand=" + brand + ", model=" + model + ", engine=" + engine + "]";
	}
	
}

class Engine{
	String power;
	String type;
	String fuelEfficiency;
	public Engine(String power, String type, String fuelEfficiency) {
		super();
		this.power = power;
		this.type = type;
		this.fuelEfficiency = fuelEfficiency;
	}
	public String toString() {
		return "Engine [power=" + power + ", type=" + type + ", fuelEfficiency=" + fuelEfficiency + "]";
	}
	
}


public class Demo {
	public static void main(String[] args) {
			Engine engine = new Engine("350hp", "Diesel", "20kmpl");
			AudiCar audiCar = new AudiCar("White" , "Audi" , "Q1" , engine);
			System.out.println(audiCar);
			audiCar.start();
			audiCar.stop();
			System.out.println(audiCar.engine.power);
			
	}
}
