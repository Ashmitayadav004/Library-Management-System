import java.util.*;

public class for_loop {
    public static void main(String[] args) {
        // for(int i=0;i<10;i++){
        // System.out.println("I love my mother and father more than i love myself.");

        // int i = 1;
        // while (i < 10) {
        // System.out.println("I love my mother and father more than i love myself.");
        // i++;
        // }

        // int i = 1;
        // do {
        // System.out.println("I love my mother and father more than i love myself.");
        // i++;

        // } while (i < 4);

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of n: ");
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        //     sum += i;
        // }
        // System.out.println("Sum of " + n + " natural numbers is " + sum);
        // sc.close();


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" x "+i+" = "+n*i);
        }
        
        sc.close();

    }
}
