package Abstract;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Square s1 = new Square(8);
        System.out.println("Area of circle is :" + c1.calculateArea());
        System.out.println("Area of square is :" + s1.calculateArea());
    }

}
