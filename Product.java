import java.util.*;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        float x = sc.nextFloat();
        System.out.print("Enter the value of y : ");
        float y = sc.nextFloat();
        float mul = (x * y);
        System.out.println("Product of " + x + " and " + y + " is " + mul);
        sc.close();
    }
}
