package com.arrays;

public class Example1 {
	public static void main(String[] args) {
		// datatype [] arrRef = new datatype[size];
		int [] arr;
		arr = new int[5]; // [10, 0 , 0 , 0, 45]
		                  //  0   1   2   3  4
		
		// Accessing elements from an array
		System.out.println("First Index : " + arr[0]);
		System.out.println("Second Index : " + arr[1]);
		System.out.println("Third Index : " + arr[2]);
		System.out.println("Fourth Index : " + arr[3]);
		System.out.println("Fifth Index : " + arr[4]);
		
		// Modify Elements of an array
		System.out.println("---------------------------");
		arr[0] = 10;
		arr[4] = 45;
		
		System.out.println("First Index : " + arr[0]);
		System.out.println("Second Index : " + arr[1]);
		System.out.println("Third Index : " + arr[2]);
		System.out.println("Fourth Index : " + arr[3]);
		System.out.println("Fifth Index : " + arr[4]);
		
		System.out.println("--------------------------------");
		// How to know the length of an array 
		System.out.println("Length of an array : " + arr.length);
	}
}
