package conditional.statements;

public class Demo {
	/**
	 * ClassName -> Demo hint -> && (a > b) && (a > c) -> return "A is largest"
	 * 
	 * define a non static method (findLargestBwThreeNumbers) taking three
	 * parameters (int a , int b , int c) if a is largest then return "A is Largest"
	 * if b is largest then return "B is Largest" if c is largest then return "C is
	 * Largest" if all are equal then return "All are Equal"
	 * 
	 * Call the non static method from main method by creating object and by passing
	 * arguments to method , and store the returned value in a result variable and
	 * print the result
	 * 
	 * Access Modifier returnType methodName(parameters...){
	 * 		// statements
	 * 		return -> if void , no need , 
	 * }
	 * 
	 */
	public String findLargestBwThreeNumbers(int a , int b , int c) {
//		 a = 20 , b = 20 , c = 10
		if((a > b) && (a > c)) {
			return "A is Largest";
		}
		if((b > a) && (b > c)) {
			return "B is Largest";
		}
		if((c > a) && (c > b)) {
			return "C is Largest";
		}
		if((a == b) && (b == c)) {
			return "All are Equal";
		}
		return "Un-Even Numbers";
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		String result = obj.findLargestBwThreeNumbers(20 , 20 , 10);
		System.out.println(result);
	}
	
	
	
	
}







