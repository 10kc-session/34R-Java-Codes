package com.exceptions;

public class Example3 {
	public static void main(String[] args) {
		try {
			String str = "Hello";
			System.out.println(str.charAt(100)); 
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Exception handled");
	}
}
