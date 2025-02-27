package operators;

public class Example2 {
	int a;
	int b;

	public void relationalOperators() {
		System.out.println("a > b : " + (a > b));
		System.out.println("a < b : " + (a < b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));
	}

	public void compareStrings(String str1, String str2) {
		System.out.println("Result : " + (str1 == str2));
//		SCP -> STRING CONSTANT POOL
		System.out.println("Result after converting to lowercase : " + (str1.toLowerCase() == str2.toLowerCase())); // Comparision with reference
		System.out.println("Result after converting to lowercase : " + (str1.toLowerCase().equals(str2.toLowerCase()))); // comparision with values
	}
	public void compareInt(int a , int b , int c) {
		System.out.println((a == b) == false);
		System.out.println((c > a) != true);
		System.out.println(true == (a + b > c));
	}
	//                                         100x            200x
	public static void compareObjects(Example2 obj1 , Example2 obj2) {
		System.out.println(obj1 == obj2); // 100x == 200x
	}
	
	public static void main(String[] args) {
		Example2 obj1 = new Example2();   // 100x
		
		Example2 obj2 = new Example2();   // 200x
		
		compareObjects(obj1 , obj2);
		compareObjects(obj1 , obj1); // 100x , 100x 
		
		compareObjects(null,null);
		
		compareObjects(new Example2() , new Example2());
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1 != obj2);
		Example2 obj3 = obj2; // shallow copy 
		System.out.println(obj3 == obj2);
		System.out.println(obj2.a == obj1.b);
		
		
		
		obj1.compareInt(20, 60, 34);
		obj1.compareStrings("Hello", "Hello");
		obj1.compareStrings("Hello", "hello");
		obj1.a = 30;
		obj1.b = 40;
		
		System.out.println(obj3.a == obj2.a);
		System.out.println(obj3.a == obj1.a);
		obj1.relationalOperators();
		obj1.a = 50;
		obj1.b = obj1.b + 10;
		System.out.println("--------------------");
		obj1.relationalOperators();
	}

}
