package operators;

public class Demo {
	int a = 10;
	int b = 20;
	// Operators 
	public void arthimeticOperators() {
		int a = 10;
		int b = 20;
		int result = a + b;
		System.out.println("Addition : " + result);
		result = a - b;
		System.out.println("Substraction : " + result);
		result = a * b;
		System.out.println("Multiplication : " + result);
		result = a / b;
		System.out.println("Division : " + result);
		result = a % b;
		System.out.println("Modulas : " + result);
		
		System.out.println("---------Masala-----------");
		float f1 = 1.5f;
		float f2 = 2.0f;
		System.out.println("Float Division : " + (f2 / f1));
		f1 = 2.5f;
		f2 = 0.0f;
		System.out.println("Float Division With 0.0 " + (f2 / f1));
		
		int x = 1;
		int y = 0;
		
//		System.out.println("Int Division With 0 " + (x / y)); 
// 		Arthimetic Exception divide by zero
		
		boolean b1 = true;
		boolean b2 = false;
//		System.out.println(b1 + b2);
		
//		byte by1 = 10;
//		byte by2 = 20;
		
//		by1 = by1 + 40;
//		by1 += 40; // we can resolve CE by this way 
//		System.out.println(by1);
		
//		byte by3 = by1 + by2; (CE)
//		System.out.println("Byte By3 : " + by3);

		Demo d1 = new Demo();
		Demo d2 = new Demo();
//		System.out.println(d1 + d2); // CE
		
		char ch1 = 10;
		char ch2 = 20;
		
//		char ch3 = ch1 + ch2; CE
		
//		System.out.println(ch1 + ch2);
		
		float h = 1.0f;
		float i = 3.0f;
		System.out.println(i % h);
		System.out.println("----------------");
		System.out.println(3 % 5);
		System.out.println(5 % 1);
		System.out.println(4 % 2);
		System.out.println(13 % 5);
		System.out.println("------------------");
		
//		System.out.println(10 + 20 - 40 + 3 * 2 + 3 % 5);
		
//		System.out.println(-1 + -1 + 50 * 2 / 5  + 4 % 3);
		
		/**
		 *  + is not only used for addition but for also
		 *   concating multiple strings
		 */
		
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println(str1 + str2);
		System.out.println(str1 + " " + str2); // Hello World
		
		String name = "Raju";
		String address = "Hyderabad";
		
//		My name is Raju and i am from Hyderabad;
		
		System.out.println("My name is " + name + " and i from " + address);
			
//		 "100100" + 200 -> "100100200"
		System.out.println("100" + 100 + 200);
		System.out.println("100" + (100 + 200)); // 100300
		
//		System.out.println("12" * 2);
//		1313100 - 60 
//		System.out.println("13" + "13" + 100 - 30 * 2); CE
		System.out.println("13" + "13" + (20 - 30 * 2));
		
		String s1 = "Hello";
		String s2 = "World";
		String s3 = s1 + " " + s2;
		String s4 = s3 + " !";
		System.out.println("Hey " + s4);
		
		System.out.println("I am " + true);
		System.out.println("I am " + true + false);
//		System.out.println("I am " + (true + false)); CE
//		System.out.println("I am " + (true + 1));
		System.out.println("I am " + false + 0);
//		"I am false" + 0

		/**
		 * 		2 * 1 = 2
		 *      2 * 2 = 4
		 *      2 * 3 = 6
		 *      
		 *      #"""""""""#
		 *      #  *   *  #
		 *      #    *    #
		 *      #  *****  #
		 *     	"""""""""""
		 */
		System.out.println("2 * 1 = 2");
		System.out.println("2 * 2 = 4");
		System.out.println("2 * 3 = 6");
		System.out.println("2 * 4 = 8");
		System.out.println("2 * 5 = 10");
		System.out.println("2 * 6 = 12");
		
		
	}
	public static void main(String[] args) {
		new Demo().arthimeticOperators();
	}
}







