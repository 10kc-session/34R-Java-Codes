package com.lambda;

import java.util.function.Predicate;
import java.util.function.BiFunction;

@FunctionalInterface
interface Calculation {
	void sum(int a, int b);
}

interface Demo {
	void print(String str);
}

interface Demo2 {
	void log();
}

interface Demo3 {
	String getName();
}

interface Demo4 {
	boolean isEven(int num);
}

interface Calculator {
	int sum(int a, int b);
}

public class Example1 {
	public static void main(String[] args) {
		
		BiFunction<Integer , Integer , Integer> func = (a , b) -> a + b;
		System.out.println(func.apply(30, 40));
		
		BiFunction<Integer, Integer, Integer> func2 = new BiFunction<Integer, Integer, Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		};
		System.out.println(func2.apply(301, 30));
		
		Calculator cal1 = (a, b) -> a + b;
		System.out.println(cal1.sum(30, 40));

		Predicate<Integer> predicate = num -> num % 2 == 0;
		System.out.println(predicate.test(40));

		Predicate<Integer> pred = num -> num % 2 == 0;

		Demo4 demo5 = num -> num % 2 == 0;
		Demo4 demo4 = new Demo4() {
			public boolean isEven(int num) {
				return num % 2 == 0;
			}
		};
		System.out.println(demo4.isEven(5) ? "Even" : "Odd");

		System.out.println(demo5.isEven(50));

		Demo3 demo3 = () -> "Java is Awesome"; // implicit return keyword
//		Demo3 demo4 = () -> System.out.println("Java is Awesome"); // error

		System.out.println(demo3.getName());

		Demo2 demo2 = () -> System.out.println("Hello World");
		demo2.log();

		Demo demo = str -> System.out.println(str);
		demo.print("Java is Awesome..");

		// if your having only single parameter no need of ()

		Calculation cal = new Calculation() {
			public void sum(int a, int b) {
				System.out.println("Sum of two numbers : " + (a + b));
			}
		};
		cal.sum(30, 50);

		// Lambda
		Calculation cal2 = (a, b) -> System.out.println("Sum of two numbers : " + (a + b));
		cal2.sum(40, 60);

	}
}
