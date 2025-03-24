package com.loops;

public class Example8 {
	public void findPerfectNumber(int num) {
		int sum = 0; 
		for(int i = 1 ; i <= num/2 ; i++) {
			if(num % i == 0) {
				sum = sum + i;
			}
		}
		if(num == sum){
			System.out.println(num);
		}
//		System.out.println((num == sum) ? "Perfect Number" 
//				: "Not A Perfect Number");
	}
	public static void main(String[] args) {
		for(int i = 1 ; i <= 10000 ; i++) {
			new Example8().findPerfectNumber(i);
		}
	}
}
