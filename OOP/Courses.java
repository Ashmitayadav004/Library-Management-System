package OOP;

public class Courses {
    public static void main(String[] args) {
        Course c1 = new Course();
        Course c2 = new Course("Java",23);
        System.out.println(c1.courseName+" "+c1.enrolledStudents+" "+Course.maxCapacity);
        System.out.println(c2.courseName+" "+c2.enrolledStudents+" "+Course.maxCapacity);
        c1.enrolledStudents("Swati");
        c2.unenrolledStudents("Hardik");
    }
}
