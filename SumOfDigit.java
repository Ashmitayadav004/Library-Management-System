import java.util.*;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits: " + sum(num));
        System.out.println("Reverse of digits: " + reverse(num));

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        sc.close();
    }

    // Method to calculate the sum of digits
    public static int sum(int num) {
        int sum = 0;
        while (num != 0) { // Continue until num becomes 0
            int rem = num % 10; // Get the last digit
            sum += rem; // Add the last digit to sum
            num = num / 10; // Remove the last digit
        }
        return sum; // Return the sum of digits
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num != 0) { // Continue until num becomes 0
            int rem = num % 10; // Get the last digit
            rev = (rev * 10) + rem; // Add the last digit to sum
            num = num / 10; // Remove the last digit
        }
        return rev; // Return the sum of digits
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= (num / 2); i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;

    }
}