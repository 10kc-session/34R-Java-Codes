package conditional.statements;

public class Example4 {
	public void simpleIf(int a, int b) {
		if (a > b) {
			System.out.println("A is Largest");
		}
		if (b > a) {
			System.out.println("B is Largest");
		}
		if (b == a) {
			System.out.println("Both are equal");
		}
	}

	public void ladderIf(int a, int b) {
		if (a > b) {
			System.out.println("A is Largest");
		} else if (b > a) {
			System.out.println("B is Largest");
		} else {
			System.out.println("Both are equal");
		}
	}

	public void checkGender(String gender) {
		if (gender == "Male") {
			System.out.println("Gender is Male");
		} else if (gender == "Female") {
			System.out.println("Gender is Female");
		} else if (gender == "Others") {
			System.out.println("Others");
		} else {
			System.out.println("Invalid Gender");
		}
	}

	/**
	 * write a java program to make calculations based on operator which is passed
	 * as argument, means take a non static method calculateBasedOnOperator(int a ,
	 * int b , String operator); now using ladder if check the operator weather it
	 * is + , - , / , % , * and calculate based on operator For Example
	 * obj.calculaterBasedOnOperator(10 , 20 , "+");
	 * 
	 * output -> 30
	 * 
	 * obj.calculaterBasedOnOperator(10 , 20 , "-");
	 * 
	 * output -> -10
	 */
//	                                        10    34            %
	public void calculateBasedOnOperator(int a, int b, String operator) {
		if (operator == "+")
			System.out.println(a + b);
		else if (operator == "-")
			System.out.println(a - b);
		else if (operator == "*")
			System.out.println(a * b);
		else if (operator == "/") {
			// to handle arithematic exception divided by 0
			if(b == 0) {
				System.out.println("Cant Divide With 0 , because of int");
			}else {
				System.out.println(a/b);
			}
		} else if (operator == "%")
			System.out.println(a % b);
		else
			System.out.println("Invalid Operator");
	}

	public static void main(String[] args) {
		new Example4().calculateBasedOnOperator(34, 3, "%");
		int a = 100;
		int b = 20;
		new Example4().simpleIf(a, b);
		new Example4().ladderIf(a, b);
		String gender = "abcd";
		new Example4().checkGender(gender);
		
		
		
	}
}
