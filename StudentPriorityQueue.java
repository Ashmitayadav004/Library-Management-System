import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        // Create a PriorityQueue of Student objects with a custom comparator
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                // Compare grades; assuming 'A' is the highest and 'F' is the lowest
                return Character.compare(student1.getGrade(), student2.getGrade());
            }
        });

        // Offer students to the priority queue
        queue.offer(new Student("Prashant", 'B'));
        queue.offer(new Student("Ashmita", 'A'));
        queue.offer(new Student("Ashmi", 'C'));
        queue.offer(new Student("Ash", 'F'));
        queue.offer(new Student("Ashmit", 'D'));

        // Print the students in order of priority
        while (!queue.isEmpty()) {
            Student student = queue.poll();
            System.out.println(student.getName() + " - " + student.getGrade());
        }
    }

    private static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }
    }
}