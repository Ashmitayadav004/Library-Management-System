import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num :");
        int num = sc.nextInt();
        printArmstrong(num);
        sc.close();

    }

    public static void printArmstrong(int num) {
        int sum = 0;
        int num1 = num;
        while (num > 0) {
            int rem = num % 10;
            sum = (sum + (rem * rem * rem));
            num = num / 10;
        }
        if (num1 == sum) {
            System.out.println(num1 + " is a Armstrong");
        } else {
            System.out.println(num1 + " is not  a Armstrong");
        }
    }
}
