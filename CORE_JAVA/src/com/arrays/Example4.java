package com.arrays;

import java.util.*;

public class Example4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size = Integer.parseInt(scanner.nextLine());

		if (size <= 0 || size > 10) {
			System.out.println("Invalid Data");
		} else {
			String[] arr = new String[size];
			for (int i = 0; i < size; i++) {
				System.out.println("Enter " + i + " index element : ");
				arr[i] = scanner.nextLine();
			}

			for (int i = 0; i < size; i++) {
				System.out.println("index " + i + " : " + arr[i]);
			}
		}

		scanner.close();
	}
}
