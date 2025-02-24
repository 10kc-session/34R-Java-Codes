package test;

public class Example3 {
	int num;
	static String name;
	public static void main(String[] args) {
		Example3 obj1 = new Example3();
		Example3 obj2 = new Example3();
		System.out.println(obj1.num);
		System.out.println(obj2.num);
		System.out.println(name);
		System.out.println("-----After Modifying----------");
		obj1.num = obj2.num + 10;
		Example3.name = "Java";
		obj2.num = obj1.num + 30;
		
		System.out.println(obj1.num);
		System.out.println(obj2.num);
		System.out.println(obj1.name + " " + obj2.name);
		
		System.out.println("----Modifying Static Variable Using Object Reference------");
		obj1.name = "Spring Boot";
		
		System.out.println(obj1.name + " " + obj2.name + " " + Example3.name);
		name = "Java is Awesome";
		
		System.out.println(obj1.name + " " + obj2.name);
		
	}
}










