package com.arrays;

import java.util.Scanner;
public interface ArrayUtilities {
	
	// will add here exception handling
	public static int[] getIntArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = scanner.nextInt();
		if(size <= 0) {
			scanner.close();
			return null;
		}
		else {
			int [] arr = new int[size];
			for(int i = 0; i < size ; i++) {
				System.out.print("Enter " + i + " index element : ");
				arr[i] = scanner.nextInt();
			}
			scanner.close();
			return arr;
		}
	}
}
