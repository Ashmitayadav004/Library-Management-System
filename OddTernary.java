import java.util.*;

public class OddTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        String result = (num % 2 == 0)? "Even" : "Odd";
        System.out.println("Number is " + result);
        sc.close();
    }
}
