import java.util.*;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of rate : ");
        int r = sc.nextInt();
        System.out.print("Enter the value of time : ");
        int t = sc.nextInt();
        System.out.print("Enter the value of principal : ");
        int p = sc.nextInt();
        float si = (float)((p*t*r)/100);
        System.out.println("Value of simple interest is " + si);
        sc.close();

    }
}
 
    

