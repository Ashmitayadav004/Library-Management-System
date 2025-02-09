package Employee;

public class Employe {
    private String name;
    private int age;
    private double salary;

    Employe(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    String getEmployeeDetails() {
        return "Employee details : Name: " + name + ",age :"
                + age + ",salary:" + salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
