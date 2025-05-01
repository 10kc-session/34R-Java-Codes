package com.exceptions;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
class Student{
	public void checkAge(int age) throws InvalidAgeException {
		if(age < 16) {
			throw new InvalidAgeException("below sixteen age not allowed");
		}else {
			System.out.println("Welcome..");
		}
	}
}
public class Example9 {
	public static void main(String[] args) {
		Student student = new Student();
		try {
			student.checkAge(17);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
}





