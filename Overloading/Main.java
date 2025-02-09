package Overloading;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(2.3, 3.4));
        System.out.println(c1.add(34, 56));
        System.out.println(c1.add(23, 45, 67));
    }
}
