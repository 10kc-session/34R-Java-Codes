package com.arrays;

public class Example6 {
	public static void main(String[] args) {
		int [] arr = ArrayUtilities.getIntArray();
		if(arr != null) {
			for(int ele : arr) {
				if(ele % 2 != 0) {
					System.out.println(ele);
				}
			}
		}
		else {
			System.out.println("Not Allowed");
		}
	}
}
