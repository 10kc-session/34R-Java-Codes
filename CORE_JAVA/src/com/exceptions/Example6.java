package com.exceptions;

public class Example6 {
	public void evenNumber(int number) throws Exception{
		if(number <= 0) {
			throw new Exception("Zero or Negative Not Allowed..");
		}else {
			System.out.println(number % 2 == 0 ? "Even" : "Odd");
		}
	}
	public static void main(String[] args) {
		try {
			new Example6().evenNumber(0);			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main method Ended");
	}
}
