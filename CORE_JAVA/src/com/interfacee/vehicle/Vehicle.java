package com.interfacee.vehicle;

public interface Vehicle {
//	defines action only but not implementation
	void startEngine(); // public abstract 
	public void stopEngine(); // valid
	abstract void accelerate(); //  valid
	public abstract void applyBrakes(); // valid
	
	boolean isPollutionChecked();
}


