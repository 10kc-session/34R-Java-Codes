package com.exceptions;

class Handling {
	public static void tiMethod(int num) {
		try {
			System.out.println("10000");
			ti1Method(num);
			System.out.println("Coders");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void ti1Method(int num) throws Exception {

		try {
			if (num == 0) {
				throw new ArithmeticException(" can not divided by zero");
			} else if (num == 10) {
				throw new Exception(" Exception ");
			} else {
				System.out.println(10 / num);
				System.out.println("Completed");
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Handling.tiMethod(15);
		
	}

}
