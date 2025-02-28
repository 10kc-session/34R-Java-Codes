package operators;

public class Example4 {
	public static void main(String[] args) {
		/**
		 * 	pre increment -> prefix of datatype -> first update the value and later assign
		 *  post increment  -> suffix of datatype -> first assign the value later update the value
		 *  
		 *  pre decrement  -> -- pref -> first update the value and later assing
		 *  post decrement -> -- suffix -> first assign and later update the value
		 */
		int a = 10; // 11
		System.out.println(a++); // access
		// update
		System.out.println(a);
		
		int b = 12; // 13 
		System.out.println(++b); // 13
		System.out.println(b); // 13
		
		System.out.println("----------------------");
		
		int c = 10; // 9
		System.out.println(c--); // 10 post decrement
		// update
		System.out.println(c); // 9
		
		int d = 12; // 11
		System.out.println(--d); // pre decrement
		System.out.println(d);

		System.out.println("----------------");
		int x = 2; // 0
//		          2   +  0  
		int res = x-- + --x; 
		System.out.println(res); // 2
//		       0  +  0  +  0  - 1
		res = x++ + --x + x++ - x--;
		System.out.println(res); // -2 , -1 , 0
		
		
		
		
		
	}
}
