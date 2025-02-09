import java.util.*;

public class OddBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number : ");
        int num = sc.nextInt();
        if ((num & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("even");
        }
        sc.close();
    }
}