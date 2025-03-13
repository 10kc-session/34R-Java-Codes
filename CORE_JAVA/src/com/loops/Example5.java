package com.loops;

public class Example5 {
//	 To Find the power a number
//	                         1         3
	public int getPower(int base , int exp) {
		int power = 1; // 1
//		                     3
		for(int i = 1 ; i <= exp; i++) {
			power = power * base;
		}
		return power;
	}
	
//	Getting the count of number      1
	public int getCountOfNumber(int num) {
		int count = 0;  // 3
		while(num != 0) {
			count++;
			num /= 10;
		}
		return count;
	}
//	                                  0
	public boolean isAmstrongNumber(int num) {
		int count = getCountOfNumber(num); // 3 -> exponential
		int temp = num; // 153
		int sum = 0; // 153
		while(num != 0) {
			int base = num % 10; // 1
			sum = sum + getPower(base , count);
//			      152 + 1
			num /= 10;
		}
		return temp == sum;
	}
	
	public static void main(String[] args) {
//		Finding number is a amstrong or not
		boolean result = new Example5().isAmstrongNumber(76543);
		System.out.println(result ? "Amstrong Number" : "Not Amstrong");
		
		
//		finding amstrong 1 to n
//		for(int i = 1 ; i <= 10000 ; i++) {
//			boolean result = new Example5().isAmstrongNumber(i);
//			if(result)
//				System.out.println(i);
//		}
	}
}
