package com.exceptions;

public class Example1 {
	public static void main(String[] args) {
		try {
			int [] arr = {1 , 2 , 3};
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("I am executed");
		
		
		try {
			String str = null;
			System.out.println(str.toUpperCase()); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Null Pointer Exception Completed");
	}
}
