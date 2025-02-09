import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Calculator : ");
        System.out.println("Enter the first number :");
        int first = sc.nextInt();
        System.out.println("Enter the second number :");
        int second = sc.nextInt();

        try {
            int result = first / second;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            if (exception.getMessage().equals("/ by zero")) {
                
                System.out.println("Divide by zerooooooooooooooo");
            } else {
                throw exception;
            }
        }

    }
}
