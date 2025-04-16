package com.arrays;

public class Example7 {
	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isPalindrome(int num) {
		int temp = num;
		int rev = 0;
		while (temp > 0) {
			rev = rev * 10 + (temp % 10);
			temp /= 10;
		}
		return num == rev;
	}

	public static void main(String[] args) {
		int[] arr = ArrayUtilities.getIntArray();
		for (int ele : arr) {
			if (isPalindrome(ele)) {
				System.out.print(ele + " ");
			}
		}
	}
}



