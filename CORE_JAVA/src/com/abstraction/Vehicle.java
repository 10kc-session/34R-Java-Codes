package com.abstraction;

public abstract class Vehicle {
	
	String modelName , vehicleNumber , company;
	
	public Vehicle(String modelName , String vehicleNumber, String company) {
		this.modelName = modelName;
		this.vehicleNumber = vehicleNumber;
		this.company = company;
	}
	
	void startEngine() {
		
	}
	
	abstract void digitalMeter();
	abstract void pollutionCheck();
	
	abstract void insurance();
	
	
	abstract String getName();
	
	
	public void fuelType() {
		System.out.println("The fuel type is petrol");
	}
}

