import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num = sc.nextInt();
        boolean prime = isPrime(num);
        if (prime) {
            System.out.println("prime");
        } else {
            System.out.println("composite");
        }
        table(num);

        sc.close();
    }

    public static void table(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }

}
