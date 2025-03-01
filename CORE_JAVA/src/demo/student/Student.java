package demo.student;
// BLC
public class Student {
	private int id;
	private int rollNo;
	private String name;

	public int getId() {
		return id;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public void setId(int sid) {
		id = sid;
	}

	public void setRollNo(int roll) {
		rollNo = roll;
	}

	public void setName(String sname) {
		name = sname;
	}
	
	public static Student getStudentDetails(int id, int rollNo, String name) {
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setRollNo(rollNo);
		return student;
	}
}
