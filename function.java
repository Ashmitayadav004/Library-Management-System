import java.util.*;

public class function {
    public static int sum(int a, int b) {
        int add = a + b;
        return add;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        System.out.print("Value of a : ");
        int x = sc.nextInt();
        System.out.print("Value of b : ");
        int y = sc.nextInt();
        System.out.println("Sum is "+sum(x, y));
        
        sc.close();
    }
}
