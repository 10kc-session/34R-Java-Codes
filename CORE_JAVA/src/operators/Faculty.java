package operators;

public class Faculty {
    static String universityName = "stanforduniversity";
    String facultyName;
    String department;

    public static void showFacultyDetails(String facultyName, String department) {
        System.out.println("University Name: " + Faculty.universityName);
        System.out.println("Department: " + department);
        System.out.println("Faculty Name: " + facultyName);
    }

    public static void main(String[] args) {
        Faculty o1 = new Faculty();
        String facultyName = "srilatha";
        String department = "cse";
        o1.showFacultyDetails(facultyName, department);

        Faculty o2 = new Faculty();
        facultyName = "vasumathi";
        department = "It";
        o2.showFacultyDetails(facultyName, department);
    }
}