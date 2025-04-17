package com.arrays;

import java.util.Arrays;

public class Example8 {
	public static void main(String[] args) {

		// Sum of array
		int[] arr = { 10, 20, 30, 40, 50 };

		int sum = 0;
		for (int ele : arr) {
			sum += ele;
		}

		System.out.println("The sum of array Elements : " + sum);

		System.out.println("-----------------------");

		// Even count , odd count
		int[] arr2 = { 1, 2, 3, 4, 5 };
		int evenCount = 0, oddCount = 0;
		for (int ele : arr2) {
			if (ele % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		System.out.println("Even Count : " + evenCount);
		System.out.println("Odd Count : " + oddCount);

		// Reverse array
		int[] arr3 = { 11, 22, 33, 44, 55 };
		System.out.println(arr3.length); // 5
		System.out.print("Array in reverse order : ");
		for (int i = arr3.length - 1; i >= 0; i--) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();

		// Target Element
		int[] arr4 = { 10, 20, 30, 40, 50 };
		int target = 30;
		boolean status = true;
		for (int i = 0; i < arr4.length; i++) {
			if (target == arr4[i]) {
				System.out.println("Element found at position : " + (i + 1));
				status = false;
				break;
			}
		}
		if (status)
			System.out.println("Element not found");

		// copy elements from one array to another

		int[] arr5 = { 1, 2, 3, 4 };
		int[] arr6 = new int[arr5.length];

		for (int i = 0; i < arr5.length; i++) {
			arr6[i] = arr5[i];
		}
		System.out.println("Elements Copied to new array  : " + Arrays.toString(arr6));

		System.out.println("-----------------------------");

		// Merge
		int[] arr7 = { 1, 2, 3, 4, 5 };
		int[] arr8 = { 6, 7, 8, 9, 10 };
		
		
		int [] arr9 = new int[arr7.length + arr8.length];
		
		for(int i = 0 ; i < arr7.length ; i++) {
			arr9[i] = arr7[i];
		}
		
		for(int i = 0 ; i < arr8.length ; i++) {
			arr9[i + arr8.length] = arr8[i];
		}
			
		System.out.println(Arrays.toString(arr9));
		
		
		// find the frequency of each element in an sorted array 
		/**
		 * input : [1 ,1 , 1 , 2 , 2 , 3 , 4, 5];
		 * frequency of 1 : 3
		 * frequency of 2 : 2
		 * frequency of 3 : 1
		 * frequency of 4 : 1
		 * frequency of 5 : 1
		 */
		
		
		
		
		
		
		
		
	}
}
