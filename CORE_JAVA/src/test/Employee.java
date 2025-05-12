package test;

public class Employee {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp = null;
		System.out.println("Emp is refered to null");
		System.gc();
		Runtime.getRuntime().gc();
		System.out.println("Cleared..");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method invoked..");
		System.out.println("Clearing resource...");
	}
}
