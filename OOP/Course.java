package OOP;

// import java.util.Scanner;

public class Course {
    static int maxCapacity;
    String courseName;
    String studentName;
    boolean isEnrolled = true;
    int enrolledStudents;
    static {
        maxCapacity = 30;
    }
    // {
    // System.out.println("Enter the capacity");
    // Scanner sc = new Scanner(System.in);
    // maxCapacity = sc.nextInt();
    // sc.close();
    // }

    Course() {
        courseName = "DSA";
        enrolledStudents = 25;
        maxCapacity = 35;
    }

    Course(String courseName, int enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
        maxCapacity = 120;
    }

    public static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }

    public void enrolledStudents(String studentName) {
        if (isEnrolled) {
            System.out.println(studentName + "  is enrolled");
            enrolledStudents++;
        }
    }

    public void unenrolledStudents(String studentName) {
        if (isEnrolled) {
            System.out.println("You are already enrolled");
        } else {
            System.out.println(studentName + " is not enrolled");

        }
    }
}
