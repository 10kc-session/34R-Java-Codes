package com.loops;

public class Example2 {
	
	public void table(int num , int value) {
		System.out.println(num  + " x " + value + " = " + (num * value));
	}
	
	public int getSumofnNaturalNumbers(int num) {
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}
	// write a java program to find even numbers from 2 to 100 by using conditional
	// statements
	
	public void getEvenNumbers() {
		for(int i = 2 ; i <= 100 ; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public void getOddNumbers() {
		for(int i = 1; i<=100 ; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	/**
	 *	write a java program to find division of 3 and 5 
	 *	from 1 to 200 in reverse order
	 */
	
	public void getDivisionOfThreeAndFive() {
		for(int i = 200; i >= 1 ; i--) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
	
	/**
	 * 		Write a Java Program find even and odd numbers from 1 to 10
	 * 		methodName -> findEvenAndOdd()
	 * 		return type -> void
	 * 		Expected output -> Even Numbers : 2 4 6 8 ....
	 * 						   Odd  Numbers : 1 3 5 7 ....
	 * 		String evenNumbers = "";  
	 *      String oddNumbers  = "";  
	 */
	
	
	public static void main(String[] args) {
		Example2 obj = new Example2();
		obj.getDivisionOfThreeAndFive();
	}
}
