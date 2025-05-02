package com.exceptions;

import java.util.Scanner;

public class Example11 {
	
	public void raise() throws Exception{
		throw new Exception();
	}
	public int getData() {
		try {
			return 100;
		}finally {
			return 200;
		}
	}
	public void method() {
		try {
			try {				
				throw new Exception();
			}catch(Exception e) {
				System.out.println("Catch Block");
			}
		}finally {
			System.out.println("Finally Block");
		}
	}
	public static void main(String[] args) {
		new Example11().method();
		System.out.println(new Example11().getData()); // 200
		System.out.println("--------------");
		Scanner scanner = new Scanner(System.in);
		try {
			new Example11().raise();
			System.out.println("Try Block");
		}catch(Exception e) {
			System.out.println("Catch Block");
		}finally {
			scanner.close();
			System.out.println("Finally Block");
		}
	}
}
