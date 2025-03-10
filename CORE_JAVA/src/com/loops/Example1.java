package com.loops;

public class Example1 {
	public void loopingMethod() {
		// This method is going to print from 1 to 5
//		for (int step = 1; step <= 100; ++step) {
//			System.out.println(step);
//		}
//		write a java program to print 1 to 5 in reverse order
		for(int i = 5; i >= 1 ; i--) {
			System.out.println(i);
		}
		/**
		 * write a java program to print from 4 to 16 and multiply 
		 * each number with 2
		 */
		for(int i = 4 ; i <= 16 ; i++) {
			System.out.println(i * 2);
		}
	}

	public void loopTricky() {
//		int i = 1;
//		for( ; i <= 5 ; i++){
//			System.out.println(i);
//		}
//		for(int i = 5 ; ;){
//			System.out.println(i);
//		}
        // infinte 
//		for (;;) {
//			System.out.println("Hello World");
//		}
		
//		for(int a = 1 ; true ; a++){
//			System.out.println("Hello");
//		}
//		System.out.println("There");
	}

	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.loopingMethod();
//		obj.loopTricky();
	}
}

//	public void printTable(int num , int value) {
//		System.out.println(num + " x " + value + " = " + (num * value) );
//	}