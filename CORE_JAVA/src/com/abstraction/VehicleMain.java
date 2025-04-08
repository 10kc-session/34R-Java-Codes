package com.abstraction;

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle vehicle;
		vehicle = new Car("Sedan", "1020", "Maruthi", 4, false);
		vehicle.startEngine();
		vehicle.fuelType();
		
		vehicle = new Truck("DCM", "12345", "Ashok", 2000);
		vehicle.startEngine();
		vehicle.fuelType();
	}
}	
