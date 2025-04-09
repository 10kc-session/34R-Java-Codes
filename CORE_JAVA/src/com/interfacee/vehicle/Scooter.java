package com.interfacee.vehicle;

public class Scooter implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("Scooter engine is started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Scooter engine is stopped");
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerating scooter");
		
		
	}

	@Override
	public void applyBrakes() {
		System.out.println("Applying brakes on scooter");		
	}
	
	@Override
	public boolean isPollutionChecked() {
		return true;
	}

}
