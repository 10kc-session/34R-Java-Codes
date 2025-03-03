package conditional.statements;

public class Example1 {
	public static void main(String[] args) {
		boolean isHavingSlippers = true;
		if (isHavingSlippers) {
			System.out.println("I can go outside because i am having slippers");
		}
		if (!isHavingSlippers) {
			System.out.println("I cannot go outside because i am not having slippers");
		}
		/**
		 * 		check weather age is greater 18 , 
		 * 		if age is > 18 then print -> Eligible for voting
		 * 		if not -> Not Eligible
		 *  < > <= >= == !=
		 */
		int age = 18;
		if(age >= 18) {
			System.out.println("Eligible for voting");
		}
		if(age < 18) {
			System.out.println("Not Eligible for voting");
		}
		
		
		/**
		 *	find the largest b/w a and b
		 *  if a is largest print "A is Big"
		 *  if b is largest print "B is Big"
		 *  if both are Equal print "Both are Equal"
		 *  
		 *  ClassName -> Demo  
		 *  hint -> && 
		 *  (a > b) && (a > c) -> return "A is largest"
		 *  
		 *  define a non static method (findLargestBwThreeNumbers) taking 
		 *  three parameters (int a , int b , int c) 
		 *  if a is largest then return "A is Largest"
		 *  if b is largest then return "B is Largest"
		 *  if c is largest then return "C is Largest"
		 *  if all are equal then return "All are Equal"
		 *  
		 *  Call the non static method from main method by creating object 
		 *  and by passing arguments to method , and store the returned value in a
		 *  result variable and print the result 
		 *  
		 */
		
		int a = 20;
		int b = 20;
//		b < a
		if(a > b) {
			System.out.println("A is Big");
		}
//		a < b
		if(b > a) {
			System.out.println("B is Big");
		}
//		b == a
		if(a == b) {
			System.out.println("Both Are Equal");
		}
		
	}
}

