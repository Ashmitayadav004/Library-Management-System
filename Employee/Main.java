package Employee;

public class Main {
    public static void main(String[] args) {
        Employe e1 = new Employe("Ashmita",20 , 1000000);
        System.out.println(e1.getEmployeeDetails());
        e1.setAge(25);
        e1.setName("Hardik");
        e1.setSalary(25000);
        System.out.println(e1.getEmployeeDetails());
        
        System.out.println(e1.getAge());

    }
}
