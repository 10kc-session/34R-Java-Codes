package test;

public class Calculator {
	public static int add(int a, int b) {
		return (a + b);
	}
	public String checkNumber(int num) {
		if (num > 0) {
			return "Positive";
		} else if (num < 0) {
			return "Negative";
		} 
		return "Zero";
	}
	public static void main(String[] args) {
		System.out.println(new Calculator().checkNumber(0));;
	}
}
