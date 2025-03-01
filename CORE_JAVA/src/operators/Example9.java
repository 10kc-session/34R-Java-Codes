package operators;

public class Example9 {
	public static void main(String[] args) {
		System.out.println(5 & 3);
		System.out.println(13 & 5);
		int a = 18;
		System.out.println(a & ++a);
		System.out.println(a);
		System.out.println(5 | 3);
		System.out.println(13 | 8);
		System.out.println("-----------------------------");
		a = 5; //  a + 1
		System.out.println(~a);
		a = -6;
		System.out.println(~a);
		
		System.out.println(12 << 2);
		
//		num / 2 ^ n
		
		System.out.println(16 >> 2);
		
		
		
	}
}
