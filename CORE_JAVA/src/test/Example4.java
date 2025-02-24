package test;

public class Example4 {
	int num;
	static int number;
	public static void main(String[] args) {
		Example4 obj1 = new Example4();
		Example4 obj2 = new Example4();
		Example4 obj3 = new Example4();	
		
		obj1.num = 40;
		Example4.number = 55;
		
		System.out.println(obj1.num + " " + obj2.num + " " + obj3.num);
		
		obj2.num = obj1.num + obj3.num;
		
		obj3.num = number + obj2.num;
		
		System.out.println(obj1.num + " " + obj2.num + " " + obj3.num);
		
	}
}










