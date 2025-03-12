package com.loops;

public class Example4 {
	
	public static void main(String[] args) {
		int number = 1234321;
		int rev = 0;
		int temp = number;
		
		while(number != 0) {
			rev = rev * 10 + number % 10;
			number /= 10;
		}
		System.out.println((rev == temp) ? "Number is Palindrome" : "Not Palindrome");		
	}
}
