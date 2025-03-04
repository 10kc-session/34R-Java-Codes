package conditional.statements;

public class Example3 {
	/*
	 * public String getLargestNum(int a , int b) { if(a > b) { return
	 * "A is Largest"; }else { return "B is Largest"; } }
	 */
	
	/**
	 * 
	 * public String validateStudent(int age , boolean isHavingIdCard) {	
			return (age >= 18 && isHavingIdCard) 
			? "Valid Student" : "Not a Valid Student";
		}
	 * Student age must be greater 18 and should have id card
	 *		if true Allowed to college 
	 *		if false not allowed 
	 *	using ternary operator
	 * 
	 */
	public String getLargestNum(int a , int b) {
		String str = (a > b) ? "A is Largest" : "B is Largest";
		return str; // value
	}
	public static void main(String[] args) {
		Example3 obj1 = new Example3();
		String result = obj1.getLargestNum(40, 5);
		System.out.println(result);
	}
}
