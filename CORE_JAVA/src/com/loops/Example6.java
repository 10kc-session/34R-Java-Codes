package com.loops;

public class Example6 {

//                          53  (2 to 7) -> Math.sqrt() -> 6
//	  2 to 3 -> 2
	public boolean isPrime(int num) {
		if(num <= 1) return false;
		for(int i = 2 ; i * i <= num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Example6 obj = new Example6();
//		System.out.println((obj.isPrime(1013)) ? "is a prime number" : "! prime");
		for(int i = 1 ; i <= 30000 ; i++) {
			if(obj.isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
/**
 * First Approach (Not Recommended)
 * int count = 0; // 3
		for(int i = 1 ; i <= num ; i++) {
			if(num % i == 0) {
				count++;
			}
			if(count > 2)
				return false;
		}
		return count == 2;
		
	Second Approach (for small numbers)
		if(num <= 1) return false;
		for(int i = 2 ; i <= num/2 ; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
		
	Third Approach (Best)
	if(num <= 1) return false;
		for(int i = 2 ; i <= (int)Math.sqrt(num) ; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
 */


