package conditional.statements;

public class Example6 {

	public void checkHelplineNumber(int number) {
		switch (number) {
		case 100:
			System.out.println("Police");
			break;
		case 101:
			System.out.println("Fire");
			break;
		case 102:
			System.out.println("Ambulance");
			break;
		case 103:
			System.out.println("Traffic Police");
			break;
		default : System.out.println("Invalid Number");
		}
	}

	public void checkGender(String gender) {
		switch (gender) {
		case "male":
			System.out.println("Gender is Male");
			break;
		case "female":
			System.out.println("Gender is Female");
			break;
		case "others":
			System.out.println("Gender is Others");
			break;
		default:
			System.out.println("Invalid Gender");
		}
	}

	public static void main(String[] args) {
		new Example6().checkGender("female");
		Example6 obj = new Example6();
		obj.checkHelplineNumber(1000);
		
//		Implicit type casting 
		switch(50 - 1) {
		case 30 : System.out.println(true); break;
		case '1' : System.out.println(false); break;
		}
	}
}









