package com.interfacee.vehicle;

public class Bike implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("Bike engine started");
	}

	@Override
	public void stopEngine() {
		System.out.println("Bike engine stopped.");
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerating Bike.");
	}

	@Override
	public void applyBrakes() {
		System.out.println("Applying brakes on bike");
	}
	@Override
	public boolean isPollutionChecked() {
		return false;
	}

}
