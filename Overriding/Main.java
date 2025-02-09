package Overriding;


public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        v1.service();
        c1.service();
    }
}
