import java.util.*;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of length : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of breadth : ");
        int y = sc.nextInt();
        int per = (2 * (x + y));
        System.out.println("Value of perimeter is " + per);
        sc.close();

    }
}
