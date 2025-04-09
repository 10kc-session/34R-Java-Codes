package com.interfacee.vehicle;

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle vehicle;
		vehicle = new Car();
		vehicle.startEngine();
		vehicle.accelerate();
		vehicle.applyBrakes();
		vehicle.stopEngine();
		System.out.println("Pollution check  : " + vehicle.isPollutionChecked());
		
		System.out.println("====================");
		
		vehicle = new Bike();
		vehicle.startEngine();
		vehicle.accelerate();
		vehicle.applyBrakes();
		vehicle.stopEngine();
		System.out.println("Pollution check  : " + vehicle.isPollutionChecked());
	}
}
