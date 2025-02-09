
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int num = (int) (Math.ceil(Math.random() * 10));
        int guess;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Welcome to the guessing game \n Please enter num between 1 to 10");
            System.out.print("Enter the guessing num  :");
            guess = sc.nextInt();
        } while (num != guess);
        System.out.println("successfully ");
        sc.close();
    }
}
