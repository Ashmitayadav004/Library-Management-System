package in.kgcoding.utils;

import in.kgcoding.geometry.Circle;
import in.kgcoding.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(4.4);
        Rectangle r1 = new Rectangle(4.5, 5.5);
        double cirArea = Math.pow(cir.radius, 2.0) * Math.PI;
        double recArea = r1.length * r1.breadth;
        System.out.println("Area of circle : " + cirArea);
        System.out.println("Area of rectangle : " + recArea);

    }

}
