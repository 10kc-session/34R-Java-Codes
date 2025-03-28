package com.constructor.chaining;

//class Person{
//	String name;
//	public Person(String name) {
//		this.name = name;
//	}
//	public Person(){
//		this.name = "Unknown";
//	}
//}
//class Student extends Person{
//	String name; // Rahul
//	public Student(String name) {
//		this.name = name;
//	}
//	public void displayData() {
//		System.out.println(this.name);
//		System.out.println(super.name);
//	}
//}

//class Vehicle {
//	public void describe() {
//		System.out.println("This is a vehicle");
//	}
//}
//class Car extends Vehicle{
//	public void describe() {
//		System.out.println("This is a car");
//		super.describe();
//	}
//}
//
//public class Example4 {
//	public static void main(String[] args) {
//		Car car  = new Car();
//		car.describe();
//	}
//}
//

//class Book{
//	public Book() {
//		System.out.println("Default Book Constructor");
//	}
//	public Book(String title) {
//		System.out.println("Book title : " + title);
//	}
//}
//
//class EBook extends Book{
//	public EBook() {
//		this("Java Programming");
//	}
//	public EBook(String title) {
//		System.out.println("Ebook title : " + title);
//	}
//}
//
//public class Example4{
//	public static void main(String[] args) {
//		new EBook();
//	}
//}

//class Employee{
//	public Employee() {
//		System.out.println("Employeee Created");
//	}
//}
//class Manager extends Employee{
//	public Manager() {
//		System.out.println("Manager Created");
//	}
//}
//
//public class Example4 {
//	public static void main(String[] args) {
//		new Manager();
//	}
//}
//class Animal{
//	
//	public void animalSleeping() {
//		System.out.println("Animal is Sleeping");
//	}
//}
//class Mammal extends Animal{
//	public void mammalSleeping() {
//		System.out.println("Mammal is Sleeping");
//	}
//}
//class Dog extends Mammal{
//	public void sleep() {
//		System.out.println("Dog is Sleeping");
//	}
//}
//
//public class Example4{
//	public static void main(String[] args) {
//		Dog dog = new Dog();
//		dog.sleep();
//		dog.mammalSleeping();
//		dog.animalSleeping();
//	}
//}
//
class A {
	public A() {
		System.out.println("A constructor");
	}
}

class B extends A {
	public B() {
		System.out.println("B Constructor");
	}
}

class C extends B {
	public C() {
		System.out.println("C constructor");
	}
}

public class Example4 {
	public static void main(String[] args) {
		new C();
	}
}
