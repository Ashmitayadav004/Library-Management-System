import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first = sc.nextInt();
        System.out.print("Enter the  second number : ");
        int second = sc.nextInt();
        
        System.out.println("Lcm of " + first + " and " + second + " is " + lcm(first, second));
        sc.close();
    }

    public static int lcm(int first, int second) {
        int i = 1;
        while (true) {
            int factor = (first * i);
            if ((factor % second) == 0) {
                return factor;
            }
            i++;
        }

    }
}
