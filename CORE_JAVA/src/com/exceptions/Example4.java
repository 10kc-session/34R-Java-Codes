package com.exceptions;

public class Example4 {
	public static void main(String[] args) {
		try {
			Integer.parseInt("abcd");
		}catch(RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("Hello World");
	}
}
