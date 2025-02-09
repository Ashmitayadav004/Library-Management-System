import java.util.*;

public class Compound{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of rate : ");
        int r = sc.nextInt();
        System.out.print("Enter the value of time : ");
        int t = sc.nextInt();
        System.out.print("Enter the value of principal : ");
        int p = sc.nextInt();
        float ci = (float) (p*(1+(r/100))*t);
        System.out.println("Value of compound interest is " + ci);
        sc.close();

    }
}
 
    


