import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num :");
        int num = sc.nextInt();
        printPalindrome(num);
        sc.close();
    }

    public static void printPalindrome(int num) {
        int rev = 0;
        int num1 = num;
        while (num > 0) {
            int rem = num % 10;
            rev = ((rev * 10) + rem);
            num = num / 10;
        }
        if (rev == num1) {
            System.out.println(num1 + " is a PAlindrome");
        } else {
            System.out.println(num1 + " is not a PAlindrome");

        }
    }
}