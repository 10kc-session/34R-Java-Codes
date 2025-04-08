package com.abstraction;

public class Bike extends Vehicle{

	Boolean hasSidecar;
	
	public Bike(String modelName , String vehicleNumber, String company , Boolean hasSidecar) {
		super(modelName , vehicleNumber , company);
		this.hasSidecar = hasSidecar;
	}
	
	@Override
	public void startEngine() {
		System.out.println("Starting engine with kick-start.");
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
