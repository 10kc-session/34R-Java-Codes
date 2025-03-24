package com.loops;

public class Example7 {

	public boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public void extractDigitsAndFindPrime(int num) {
		while(num != 0) {
			int digit = num % 10; 
			if(isPrime(digit)) {
				System.out.println(digit);  
			}
			num /= 10;  
		}
	}
	
	public static void main(String[] args) {
		Example7 example7 = new Example7();
		example7.extractDigitsAndFindPrime(7482);
		
		
		
	}
}
