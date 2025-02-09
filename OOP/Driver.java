package OOP;

public class Driver {
    public static void main(String[] args) {
        // Car mycar = new Car();
        // mycar.addFuel(6);
        // mycar.drive();
        // mycar.drive();
        // mycar.drive();
        // mycar.drive();
        // mycar.getCurrentFuel();
        // mycar.addFuel(6);
        // mycar.addFuel(6);
        // mycar.getCurrentFuel();
        // mycar.drive();
        // mycar.getCurrentFuel();

        Car swift = new Car();
        swift.addFuel(6);
        swift.start();
        swift.drive();
        swift.getCurrentFuel();
        swift.drive().start();
        ;
        System.out.println(swift.color);
    }
}
