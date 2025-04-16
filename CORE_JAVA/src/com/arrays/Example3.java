package com.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Example3 {
	public static void main(String[] args) {
		/**
		 * datatype [] arrRef = new datatype[size];
		 * 
		 * datatype [] arrRef = {elements ..... };
		 * 
		 * datatype [] arrRef = new datatype[]{elements....}
		 */
		// To take inputs from user
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of an array : ");

		// to define the size array at runtime
		int size = scanner.nextInt();

		int[] arr = new int[size];

		// this loop is used assign element up to size (array length)
		for (int i = 0; i < size; i++) {
			System.out.print("Enter " + i + " index element : ");
			int ele = scanner.nextInt(); // or arr[i] = scanner.nextInt();
			arr[i] = ele;
		}
		// Used to print in array format
		System.out.println(Arrays.toString(arr));

		scanner.close();
	}
}
