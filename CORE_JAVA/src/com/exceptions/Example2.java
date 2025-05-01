package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size : ");
		try {
			int [] arr = new int[scanner.nextInt()];
			System.out.println(arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("Negative Size is not allowed...");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("only digits are allowed");
		}
		System.out.println("Completed...");
		scanner.close();
		
	}
}
