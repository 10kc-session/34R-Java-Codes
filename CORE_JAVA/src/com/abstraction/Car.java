package com.abstraction;

public class Car extends Vehicle{
	Integer numberOfDoors;
	Boolean hasSunroof;
	
	public Car(String modelName , String vehicleNumber , String company , Integer numberOfDoors , Boolean hasSunroof) {
		super(modelName, vehicleNumber , company);
		this.numberOfDoors = numberOfDoors;
		this.hasSunroof = hasSunroof;
	}
	
	@Override
	public void startEngine() {
		System.out.println("Starting engine with key ignition.");
	}
	
	@Override
	public void digitalMeter() {
		System.out.println("Touch screen digital meter");
	}
	
	@Override
	public void pollutionCheck() {
		System.out.println("Green pollution");
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
