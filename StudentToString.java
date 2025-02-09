public class StudentToString {
    String name;
    String rollno;
    String house;
    int age;

    public StudentToString(String name, String rollno, String house, int age) {
        this.name = name;
        this.rollno = rollno;
        this.house = house;
        this.age = age;
    }

    public String toString() {
        return "Student Details : {name :" + name + ",rollno : " + rollno + ",house : " + house + ",age:" + age + " }";
    }

    public static void main(String[] args) {
        StudentToString stu1 = new StudentToString("Hardik", "25", "Surat", 20);
        System.out.println(stu1);
    }
}
