package com.exceptions;

class CarStopped extends Exception {
	public CarStopped(String message) {
		super(message);
	}
}

class CarPuncture extends Exception {
	public CarPuncture(String message) {
		super(message);
	}
}

class CarHeat extends Exception {
	public CarHeat(String message) {
		super(message);
	}
}

public class CarTest {
	public static void stop(String str) throws CarStopped{
		if(str.equals("stop")) {
			throw new CarStopped("Car has been Stopped");
		}
		else {
			System.out.println("Car not Stalled");
		}
	}
	public static void puncture(String str) throws CarPuncture{
		if(str.equals("puncture")) {
			throw new CarPuncture("Car has been Puncture");
		}
		else {
			System.out.println("Car not Puncture");
		}
	}
	public static void carHeat(int temp) throws CarHeat{
		if(temp > 50) {
			throw new CarHeat("Car is Heated more than 50 degrees");
		}
		else {
			System.out.println("Car not Stolled");
		}
	}
	public static void main(String[] args) {
		try {
			CarTest.stop("stop");
		} catch (CarStopped e) {
			e.printStackTrace();
		}
		try {
			CarTest.puncture("puncture");
		}
		catch(CarPuncture e) {
			e.printStackTrace();
		}
	}

}








