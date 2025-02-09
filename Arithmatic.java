import java.util.*;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("a + b: " + (a + b));
        System.out.println("a * b: " + a * b);
        System.out.println("a - b: " + (a - b));
        System.out.println("a / b: " + a / b);
        System.out.println("a % b: " + a % b);
        sc.close();

    }
}
