import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int num = 25;
        int guess;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Welcome to the guessing game \n Please enter num between 0 to 50");
            System.out.print("Enter the guessing num  :");
            guess = sc.nextInt();
        } while (num != guess);
        System.out.println("successfully ");
        sc.close();
    }
}
