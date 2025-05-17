package com.object;

class Person {
	String name;
	int id;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || this.getClass() != obj.getClass())
			return false;

		Person person = (Person) obj;

		return (this.id == person.id) && 
			(this.name == null ? person.name == null : this.name.equals(person.name));
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	
}

public class Example1 {
	public static void main(String[] args) {

//		person1.equals(person2);
		Person person1 = new Person(101, null);
		Person person2 = new Person(101, null);
		Person person3 = new Person(102, "rahul");
		
		System.out.println(person1.equals(person1));

		System.out.println(person1.equals(null));
//		person1.equals(person2);
//		person1.equals(example1);

		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));

		/*
		 * Person person = new Person("ameer"); System.out.println(person.getClass());
		 * System.out.println(person.getClass().getName());
		 * 
		 * Method[] declaredMethods = person.getClass().getDeclaredMethods();
		 * 
		 * for(Method method : declaredMethods) { System.out.println(method); }
		 * 
		 * Person person2 = new Person(""); Person person3 = new Person(""); Person
		 * person4 = person2; System.out.println(person2.hashCode());
		 * 
		 * System.out.println(person3.hashCode());
		 * 
		 * System.out.println(person4.hashCode());
		 * 
		 * String str1 = "java"; String str2 = "java"; String str3 = new String("Java");
		 * 
		 * System.out.println(str1.hashCode()); System.out.println(str2.hashCode());
		 * System.out.println(str3.hashCode()); System.out.println(str3.hashCode() ==
		 * str1.hashCode());
		 * 
		 * System.out.println(System.identityHashCode(str3));
		 * System.out.println(System.identityHashCode(str1));
		 * System.out.println(System.identityHashCode(str2));
		 */

	}
}
