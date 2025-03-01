package demo.student;

public class StudentMain {
	
	public static void main(String[] args) {
		Student student = Student.getStudentDetails(10 , 10 , "Hemanth");
		Student student2 = Student.getStudentDetails(1, 101, "Ravali");
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getRollNo());
		
		System.out.println("------------------------");
		System.out.println(student2.getId());
		System.out.println(student2.getName());
		System.out.println(student2.getRollNo());
	}
}
