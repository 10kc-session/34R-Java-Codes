package operators;

public class Example8 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("------------------");
		System.out.println((10 >= 30) && (10 <= 50));
		int a = 1; // 3
		System.out.println(false && (++a == 2));
		System.out.println(a);
//		                   true &&  true  -> true 
		System.out.println(true && (++a == a++));
		System.out.println(a); // 3
		
//		--------------------------------------------
		System.out.println("**************");
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(true || true);
		System.out.println(false || false);
		
		System.out.println((true == true) || (false != false));
//		                       false  ||   true
		System.out.println((10 != 10) || (30 <= 40));
		
		System.out.println((true && false) && false);
		System.out.println((true || false) && false);
		System.out.println((true || false) || false || true);
		int x = 30; // 30
//		                           true         &&   false
		System.out.println((true || x++ == ++x) && (--x == ++x)); // false
		System.out.println(x);
		
		Example8 obj1 = new Example8();
		Example8 obj2 = new Example8();
		
		System.out.println((obj1 == obj2) || ("hello" == "hello"));
		int y = 4; // 8
//			                   				false
		System.out.println(!(y++ == ++y + y) && (y++ == ++y) || (--y == ++y));
		System.out.println(y);
	}
}
