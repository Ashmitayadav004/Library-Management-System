package Overriding;

public class Car extends Vehicle {
    public void service(){
        super.service();
        System.out.println("Car is servicing");
    }
}
