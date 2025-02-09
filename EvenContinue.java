import java.util.Scanner;

public class EvenContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first = sc.nextInt();
        System.out.print("Enter the the last number");
        int last = sc.nextInt();
        int i = first;
        while (i <= last) {
            if ((i % 2 )!= 0) {
                i++;
                continue;
            } else {
                System.out.println(i);
                
            }
            i++;
        }
        sc.close();
    }
}