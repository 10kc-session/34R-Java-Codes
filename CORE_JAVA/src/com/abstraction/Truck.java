package com.abstraction;

public class Truck extends Vehicle{
	
	Integer cargoCapacity;
	
	public Truck(String modelName , String vehicleNumber, String company , Integer cargoCapacity) {
		super(modelName , vehicleNumber , company);
		this.cargoCapacity = cargoCapacity;
	}
	
	@Override
	public void startEngine() {
		System.out.println("Starting engine with heavy-load warm-up.");
	}
	
	@Override
	public void fuelType() {
		System.out.println("Fuel type is diesel...");
	}

	@Override
	void digitalMeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void pollutionCheck() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void insurance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
