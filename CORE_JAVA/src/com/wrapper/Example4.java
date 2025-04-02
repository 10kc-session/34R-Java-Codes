package com.wrapper;

public class Example4 {
	public static void main(String[] args) {
//		Integer i1 = null;
//		int i = i1; // NullPointerException
//		System.out.println(i);
		
//		Integer i1 = 10;
//		System.out.println(i1.intValue());
//		System.out.println(i1.byteValue());
//		System.out.println(i1.shortValue());
//		System.out.println(i1.doubleValue());
//		System.out.println(i1.floatValue());
//		System.out.println(i1.longValue());
		
		Integer i1 = 10;
		System.out.println(i1.toString());
		
		String str = "10"; // "10"
		
		int num = Integer.valueOf(str); // converting to number and auto unboxing
		
		System.out.println(num);
		
		String str1 = "10.235";
		
		double num1 = Double.valueOf(str1);
		System.out.println(num1 + 10);
		
		str1 = "45";
		System.out.println(Integer.parseInt(str1) + 10);
		
		System.out.println(Float.parseFloat("10.43"));
		// 0 1 2 3 4 5 6 7 8 9 a b c d e f 
		str1 = "12af";
		//    15 + 160 + 512 + 4096   
		System.out.println(Integer.parseInt(str1 , 16));
	}
}

