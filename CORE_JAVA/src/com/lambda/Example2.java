package com.lambda;

interface NumberChecker{
	boolean checkNumber(int num);
}
interface CharChecker{
	void checkChar(char ch);
}
public class Example2 {
	public static boolean isPrime(int number) {
		if(number <= 1) return false;
		for(int i = 2; i * i <= number ; i++) {
			if(number % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		NumberChecker number = num -> isPrime(num);
		System.out.println(number.checkNumber(3) ? "Prime Number" : "! Prime");
		
		CharChecker charCheck =  ch -> System.out.println(isPrime(ch) ? "Prime Number" : "! Prime");
		charCheck.checkChar('A');
		
	}
}






