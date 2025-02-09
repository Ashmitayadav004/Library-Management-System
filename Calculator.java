import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();

        System.out.println("Choose any operation :\n1:Add\n2:Sub\n3:Multiply\n4:Divide");
        System.out.print("Enter the operation number : ");
        int op = sc.nextInt();
       
        int result = operation(op, num1, num2);
        System.out.println("Your answer  is " + result);
        sc.close();
    }

    public static int operation(int op, int num1, int num2) {
        int result = switch (op) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> num1 / num2;
            default -> 0;

        };
                return result;
    }
}
