import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        factorial(n);
        printTable(n);
        sum(n);
        sc.close();
    }

    public static void factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;   
        }
        System.out.println("Factorial is " + ans);
    }

    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
    public static void sum(int n) {
        int sum =0;
        for(int i=1;i<=n;i++){
            if((i%2)!= 0){
                sum+=i;
            }
        }
        System.out.println("Sum is "+sum);
    }
}