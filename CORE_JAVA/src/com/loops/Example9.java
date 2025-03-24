package com.loops;

public class Example9 {
	
	public static void fibanociSeries(int num) {
		int first = 0; 
		int second = 1;
		System.out.print("Fibanoci Series : " + first + "," + second + ",");
		while(true) {
			int next = first + second;
			if(next > num) {
				break;
			}
			System.out.print(next + ",");
			first = second;
			second = next;
		}
	}
	public static void main(String[] args) {
		fibanociSeries(50);
	}
}
