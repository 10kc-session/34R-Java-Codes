package com.method.overriding;

class Parent{
	public void sleeping() {
		System.out.println("Parent is sleeping at 11pm");
	}
	public void eating() {
		System.out.println("Parent is eating idly...");
	}
}
class Child extends Parent{
	public void sleeping() {
		System.out.println("Child is sleeping at 1am...");
	}
//	public void eating() {
//		System.out.println("Child is eating fastfood...");
//	}
	public void playOnlineGames() {
		System.out.println("Online games....");
	}
}
public class Test1 {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		Parent parent1 = new Child();
		parent1.sleeping();
		parent1.eating();
//		parent1.playOnlineGames();
		
		/**
		 *  at time of compilation
		 *  first compiler will check weather method is 
		 *  present in parent class or not
		 *  
		 *  if method is not present it will throw CE
		 *  if method is present now the responsibility is on interpreter 
		 *  interpreter checks which object i am going create 
		 *  and execute same class method if method is present
		 *  if not it is going to execute parent class method ,
		 *  this is why method overriding is know as runtime polymorphism 
		 */
		
		System.out.println("------------------------");
		
		parent.eating();
		parent.sleeping();
		
		
		System.out.println("------------------------");
		
		child.eating();
		child.sleeping();
	}
}




