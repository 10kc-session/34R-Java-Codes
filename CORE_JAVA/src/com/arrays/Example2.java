package com.arrays;

public class Example2 {
	public static void main(String[] args) {
		int [] arr = new int[10]; 
		
		// assigning the value
		for(int i = 0; i <= 9 ; i++) {
			arr[i] = i + 1;
		}
		
		// printing the value
		for(int i = 0; i <= 9 ; i++) {
			System.out.println("Element at "+ i +" index : " + arr[i]);
		}
		
		System.out.println(arr[10]);
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		arr[5] = 6;
//		arr[6] = 7;
//		arr[7] = 8;
//		arr[8] = 9;
//		arr[9] = 10;
//		
//		System.out.println("Element at 0 index : " + arr[0]);
//		System.out.println("Element at 1 index : " + arr[1]);
//		System.out.println("Element at 2 index : " + arr[2]);
//		System.out.println("Element at 3 index : " + arr[3]);
//		System.out.println("Element at 4 index : " + arr[4]);
//		System.out.println("Element at 5 index : " + arr[5]);
//		System.out.println("Element at 6 index : " + arr[6]);
//		System.out.println("Element at 7 index : " + arr[7]);
//		System.out.println("Element at 8 index : " + arr[8]);
//		System.out.println("Element at 9 index : " + arr[9]);
	}
}
