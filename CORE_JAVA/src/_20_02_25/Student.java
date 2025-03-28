package _20_02_25;

public class Student {
	String studentName;
	int studentId;
	long studentPhno;
	
	public void addStudentDetails(String stName, int stId, long stPhno) {
		studentName = stName;
		studentId = stId;
		studentPhno = stPhno;
	}
	
	public String displayDetails() {
		return "Student Name : " + studentName + "\nStudent Id : " + studentId + "\nStudent Phno : " + studentPhno;
	}
	
	public static void main(String[] args) {
		Student suresh = new Student();
		suresh.addStudentDetails("Suresh", 100, 12345678);
		String sureshDetails = suresh.displayDetails();
		System.out.println(sureshDetails);
	}

}



