package com.loops;

public class Example3 {
	
	public static void main(String[] args) {
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i = i + 1;
		}
		System.out.println("*****************");
//		1 to 5 in reverse order using for loop
		int j = 5;
		while(j >= 1) {
			System.out.print(j-- + " ");
		}
		// 5 4 3 2 1
	}
}
