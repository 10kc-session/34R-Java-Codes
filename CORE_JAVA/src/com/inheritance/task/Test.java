package com.inheritance.task;

class Vehicle{
	String make;
	String model;
	int year;
	
	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public void displayInfo() {
		System.out.println("Brand Name : " + make);
		System.out.println("Model : " + model);
		System.out.println("Year  : " + year);
	}
	
}

class Car extends Vehicle{
	int numberOfDoors;

	public Car(String make, String model, int year , int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	
	public void  displayCarInfo() {
		System.out.println("Brand Name : " + make);
		System.out.println("Model : " + model);
		System.out.println("Year  : " + year);
		System.out.println("Number of Doors : " + numberOfDoors);
	}
	
}

class Truck extends Vehicle{
		int cargoCapacity;

		public Truck(String make, String model, int year , int cargoCapacity) {
			super(make, model, year);
			this.cargoCapacity = cargoCapacity;
		}
		
		public void displayTruckInfo() {
			System.out.println("Brand Name : " + make);
			System.out.println("Model : " + model);
			System.out.println("Year  : " + year);
			System.out.println("Cargo Capacity : " + cargoCapacity);
		}
		
}
public class Test {
	public static void main(String[] args) {
		 Vehicle vehicle = new Car("Toyota", "Corolla", 2022, 4); 
		 vehicle.displayInfo(); // parent class method
		 
		 System.out.println("--------------------------");
		 
		 Car car = (Car)vehicle;
		 car.displayCarInfo(); // child class method
		 
		 System.out.println("---------------------------------");
		 
		 Vehicle truck = new Truck("Ford", "F-150", 2021, 1000); 
		 truck.displayInfo(); // parent class method
		 
		 System.out.println("----------------------");
		 
		 System.out.println(Math.PI);
		 
		 Truck truc = (Truck)truck;
		 
		 truc.displayTruckInfo();
	}
}




