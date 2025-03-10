package test;

public class Check {
	int x = 10; 

	static void display(Check check) {
		System.out.println("Value of x: " + check.x);
	}

	public static void main(String args[]) {
		Check check = new Check();
		display(check);
		check.x = 50;
		display(check);
	}
}
