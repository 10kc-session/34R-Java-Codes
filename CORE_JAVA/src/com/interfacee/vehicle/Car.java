package com.interfacee.vehicle;

public class Car implements Vehicle {
	
	@Override
	public void startEngine() {
		System.out.println("Car engine is started");
	}
	
	@Override
	public void stopEngine() {
		System.out.println("Car engine is stopped");
	}
	
	@Override
	public void accelerate() {
		System.out.println("Accelerating car");
	}
	
	@Override
	public void applyBrakes() {
		System.out.println("Applying brakes on car");
	}
	
	@Override
	public boolean isPollutionChecked() {
		return true;
	}
}
