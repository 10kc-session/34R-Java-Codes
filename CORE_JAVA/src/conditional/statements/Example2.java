package conditional.statements;

public class Example2 {
	
	public boolean isEven(int num) {
		if(num % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String validateStudent(int age , boolean isHavingIdCard) {	
		if(age >= 18 && isHavingIdCard)
			return "Valid Student";
		else
			return "Not a Valid Student";
	}
	public boolean isSpicyFood(String powder) {
		if(powder == "Mirchi" || powder == "Pepper") {
			return true;
		}
		else {
			return false;
		}
	}
	public void findLargestNumber(int a , int b) {
		if(a > b) {
			System.out.println("A is Big");
		}else {
			if(a == b) {
				System.out.println("Both are equal");
			}else {
				System.out.println("B is Big");
			}
		}
	}
	public static void main(String[] args) {
//		System.out.println(new Example2().validateStudent(19, true));
		Example2 obj = new Example2();
//		obj.findLargestNumber(40 , 10);
//		find the largestNumber b/w a and b 
//			if a is bigger 
//		if b is bi
//		if eqaul = 
		
//		boolean result = obj.isSpicyFood(null);
//		if(result) {
//			System.out.println("Spicy Food");
//		}else {
//			System.out.println("Non Spicy Food");
//		}
		
		
//		System.out.println(obj.validateStudent(0, false));
//		String result = obj.validateStudent(16, true);
//		System.out.println(result);
	}
}








