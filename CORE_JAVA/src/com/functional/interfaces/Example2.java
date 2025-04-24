package com.functional.interfaces;

import java.util.function.Predicate;

class A implements Predicate<Integer>{
	public boolean test(Integer i) {
		return i % 2 == 0;
	}
}

public class Example2 {
	public static void main(String[] args) {
		Predicate<Integer> isEven = new Predicate<Integer>() {
			public boolean test(Integer i) {
				return i % 2 == 0;
			}
		};
		System.out.println(isEven.test(10));
		
		Predicate<Integer> isOdd = new Predicate<Integer>() {
			public boolean test(Integer i ) {
				return i % 2 != 0;
			}
		};
		System.out.println(isOdd.test(40));
	}
}





