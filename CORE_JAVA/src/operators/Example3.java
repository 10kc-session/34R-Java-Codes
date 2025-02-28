package operators;

public class Example3 {
	public static void main(String[] args) {
		int a = 5;
		int b = +a;
		System.out.println(b);
		int c = -b;
		System.out.println(c);
		
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(!(10 == 10));
		System.out.println(!!(10 != 10));
		
//		 ++, --
//       increment = adds 1
//		 decrement = subtracts 1
	
		
		/**
		 *  post increment , pre increment -> ++
		 *  	prefix of datatype
		 *  	
		 *  post decrement , pre decrement  -> --
		 *  	suffix of datatype
		 */
		
		int x = 10;
		x++; // x = x + 1
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);
		
		int y = 30;
		x = y++; // post increment -> first assign , later increment
		System.out.println(x);
		System.out.println(y);
		
		int z = 40;
		int d = ++z; // pre increment -> first increment , later assign
		System.out.println(d);
		System.out.println(z);
		
		int f = 1; // 2 
		//        access the value , later increment
		int res = f++ + f;
//		           1  +  2
		System.out.println(res + " " + f);
		
		int xy = 40; // 41
//		       40  +  42 
		res = xy++ + ++xy;
		System.out.println(res + "  " + xy);
		
		
		int cb = 40; // 41 42 43
		System.out.println(++cb); // cb = cb + 1
		
		System.out.println(cb++); // 41
		// cb = cb + 1;
		
		System.out.println(++cb); // cb = cb + 1 -> 43
		
		System.out.println(cb); // 43
		
		
		int i = 20; // 23
//		        i = i + 1   21 + 21
		System.out.println(++i + i); // 42
//		                   21  +  23
		System.out.println(i++ + ++i); // 44
		// i = i + 1 
		
		int j = 1; // 4
		System.out.println(j++ + j++ + ++j + j); // 9 , 11  , 16 
		//                  1  +  2  +  4  + 4
		
		int k = 3; // 7
		System.out.println(k++ + ++k + k - ++k - k++); // 1 2 
//		                    3  +  5  + 5 - 6 - 6            
		System.out.println(k); // 7 5
	}
}




