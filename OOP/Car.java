package OOP;

public class Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    Car() {
        noOfSeats = 5;
        noOfWheels = 4;
        color = "Black";
        maxSpeed = 150;
        currentFuelInLiters = 2;
    }

    Car(String color) {
        this.color = color;
    }

    public void start() {
        if (currentFuelInLiters == 0) {
            System.out.println("You can not drive the car .");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Add more fuel ");

        } else {
            System.out.println("Car is driving ");

        }
    }

    public Car drive() {
        if (currentFuelInLiters == 0) {
            System.out.println("You can not drive the car .");
        } else {
            System.out.println("Car is driving ");
            currentFuelInLiters--;
        }
        return this;
    }

    public void getCurrentFuel() {
        System.out.println(currentFuelInLiters);

    }

    public void addFuel(float fuel) {

        currentFuelInLiters += fuel;
    }
}

/*
 * if both the constructors called at the same time then no need to pass
 * compulsary the arguments of parameterized constructors at the time of object.
 * default value is used in program.
 */
/*if only default called no need to pass any thing and its default value is used .
 * if only paramterized then value of parameter should be called .
*/