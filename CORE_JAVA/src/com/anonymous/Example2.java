package com.anonymous;

import java.util.Arrays;

interface Laptop {
	void unlock(); // public abstract
}

interface EvenOrOdd {
	boolean isEvenOrOdd(int num);
}

class Student {
	String name;

	public Student(String name) {
		this.name = name;
	}

}

interface Names {
	String getStudentName(Student student);
}

interface Sorter {
	int[] arraySorter(int[] arr);
}


interface DuplicatesRemover {
	int[] removeDuplicate(int[] arr);
}

public class Example2 {
	public static void main(String[] args) {

		int[] arr = { 1, 5, 2, 1, 4, 5, 6 };
		// output : 2 5
		// count -> > 1

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					count++;
					break;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}

		System.out.println("==============================");

		int[] arr1 = { 1, 5, 4, 2, 3 };
		Sorter sort = new Sorter() {
			@Override
			public int[] arraySorter(int[] arr) {
				Arrays.sort(arr);
				for (int i = 0; i < arr.length; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i] > arr[j]) {
							int temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}
					}
				}
				return arr;
			}
		};

//		System.out.println(Arrays.toString(sort.arraySorter(arr)));

		Student student = new Student("Ravi");
		Names names = new Names() {
			@Override
			public String getStudentName(Student student) {
				return student.name;
			}
		};

		System.out.println(names.getStudentName(student));
		System.out.println(student.name);

		EvenOrOdd evenOrOdd = new EvenOrOdd() {
			public boolean isEvenOrOdd(int num) {
				return num % 2 == 0;
			}
		};
		System.out.println(evenOrOdd.isEvenOrOdd(33) ? "Even Number" : "Odd Number");

		// Anonymous implements Laptop
		// Laptop lappy = new Anonymous();

		Laptop lappy = new Laptop() {
			public void unlock() {
				System.out.println("1234");
			}
		};
		lappy.unlock();
	}
}
