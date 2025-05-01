package com.exceptions;

class InvalidAgeOfVehicleException extends Exception{
	public InvalidAgeOfVehicleException(String message) {
		super(message);
	}
}

class InvalidAgeOfTireException extends Exception{
	public InvalidAgeOfTireException(String message) {
		super(message);
	}
}

class InvalidAgeOfEngineException extends Exception{
	public InvalidAgeOfEngineException(String message) {
		super(message);
	}
}
class Vehicle{
	public void checkAge(int ageOfVehicle , int ageOfEngine , int ageOfTire) throws InvalidAgeOfVehicleException, InvalidAgeOfTireException, InvalidAgeOfEngineException {
		if(ageOfVehicle > 10) {
			throw new InvalidAgeOfVehicleException("greater than 10 years vehicles are not allowed.");
		}else if(ageOfTire > 2) {
			throw new InvalidAgeOfTireException("greater than 2 years tires are not allowed.");
		}else if (ageOfEngine > 15) {
			throw new InvalidAgeOfEngineException("greater than 15 years engines are not allowed.");
		}else {
			System.out.println("Good Condition");
		}
	}
}
public class Example10 {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		
		try {
			vehicle.checkAge(14, 2, 2);
		} catch (InvalidAgeOfVehicleException | InvalidAgeOfTireException | InvalidAgeOfEngineException e) {
			e.printStackTrace();
		}
	}
}




