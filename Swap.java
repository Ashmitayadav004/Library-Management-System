import java.util.*;
public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int c = a;
        a=b;
        b=c;
        System.out.println("a : "+a+"\n"+"b : "+b);
        sc.close();
    }
}
