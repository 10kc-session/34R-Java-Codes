package com.exceptions;

class Number{
	public void isEven(int number) throws RuntimeException {
		if(number <= 0) {
			throw new RuntimeException("Zero or negative not allowed");
		}else {
			System.out.println(number % 2 == 0 ? "Even" : "Odd");
		}
	}
}

public class Example7 {
	public static void main(String[] args) {
		new Number().isEven(0);
		System.out.println("Main Method Ended");
	}
}
