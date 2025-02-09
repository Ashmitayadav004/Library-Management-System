import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num :");
        int num = sc.nextInt();
        printFibonacci(num);
        sc.close();

    }

    public static void printFibonacci(int num) {
        if (num < 0) {
            return;
        }
        System.out.println("0 ");
        if (num == 0)
            return;
        int first = 0, second = 1;
        while ((first + second) <= num) {
            int third = first + second;
            System.out.println(third + " ");
            first = second;
            second = third;
        }
    }
}
