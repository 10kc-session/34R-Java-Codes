package test;

public class Example2 {
	int num;
	public static void main(String[] args) {
		Example2 obj1 = new Example2();
		System.out.println("Object 1 Num Value : " + obj1.num);
		obj1.num = 20;  // modifying own property
		
		Example2 obj2 = new Example2();
		System.out.println("Object 2 Num Value : " + obj2.num);
		obj2.num = 45; // modifying own property
		
		System.out.println("------------------------------");
		System.out.println("Object 1 Modified Num Value : " + obj1.num);
		System.out.println("Object 2 Modified Num Value : " + obj2.num);
		
		obj1.num = obj2.num + 10;
		
		System.out.println("Object 1 Modified Num Value : "+obj1.num);
	}
}










