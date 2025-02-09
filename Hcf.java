import java.util.*;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num :");
        int first = sc.nextInt();
        System.out.print("Enter the second num :");
        int second = sc.nextInt();
        System.out.print("Gcd is : " + gcd(first, second));

        sc.close();
    }

    public static int gcd(int first, int second) {
        int gcd = 1;
        int i = 2;
        int min = min(first, second);
        while(i<=min){
            if(((first %i)==0) &&((second%i)==0)){
                gcd=i;
            }
            i++;
        }

        return gcd;
    }

    public static int min(int first, int second) {
        if (first > second) {
            return second;
        } else {
            return first;
        }
    }
}
