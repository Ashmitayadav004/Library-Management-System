import java.util.Scanner;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getCircumference() {
        return 2 * radius * Math.PI;
    }

    double area() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        System.out.print("Enter the radius of a circle :");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        Circle c1 = new Circle(radius);
        System.out.println("Circumference is :" + c1.getCircumference());
        System.out.println("Area is " + c1.area());

        sc.close();
    }
}
