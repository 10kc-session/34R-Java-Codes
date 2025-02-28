package operators;

public class Example5 {
	int a;
	int b;
	public static void main(String[] args) {
		Example5 obj1 = new Example5();
		Example5 obj2 = new Example5();
		
		System.out.println(obj1.a + obj2.a); // 0 + 0 -> 0
		obj1.a++;  // 3
		System.out.println(obj1.a); // 1
//		          1       +   3
		obj2.a = obj1.a++ + ++obj1.a; // 4
		
		System.out.println(obj2.a + obj1.a); // 7 , 5 , 4
	}
}




