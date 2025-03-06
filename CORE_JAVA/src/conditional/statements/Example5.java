package conditional.statements;

public class Example5 {
	/**
	 * write a java program to find student grades based on marks if marks are
	 * between 90 and 100 then grade will be A if marks are between 89 and 70 then
	 * grade will be B if marks are between 69 and 50 then grade will be C if marks
	 * are between 49 and 35 then grade will be D if marks are less than 35 then
	 * grade will be F if marks are negative or greater than 100 display invalid
	 * marks
	 * 
	 * take a non static method which returns the grade based on marks methodName ->
	 * getGrades(); parameter -> int marks; return type -> String
	 */
	public String getGrades(int marks) {
		String grade = null;
		if (marks < 0 || marks > 100) {
			grade = "Invalid Marks";
		}
		else if (marks >= 90 && marks <= 100) {
			grade = "A";
		} 
		else if (marks >= 70 && marks <= 89) {
			grade = "B";
		}
		else if (marks >= 50 && marks <= 69) {
			grade = "C";
		} 
		else if (marks >= 35 && marks <= 49) {
			grade = "D";
		} 
		else {
			grade = "F";
		}
		return grade;
	}

	public static void main(String[] args) {
		String result = new Example5().getGrades(-4);
		System.out.println(result);
	}
}
