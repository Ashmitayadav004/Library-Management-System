import java.util.*;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of length : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of breadth : ");
        int y = sc.nextInt();
        int per = ((x*y)/2);
        System.out.println("Value of area is " + per);
        sc.close();

    }
}
