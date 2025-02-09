package Employeeee;

import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Employe> emp = List.of(
                new Employe("Ashmita", 100000),
                new Employe("Ash", 2334),
                new Employe("Ashu", 23455),
                new Employe("Ashmi", 1267),
                new Employe("Ashmit", 6789));

        emp.stream()
                .sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);
    }
}
