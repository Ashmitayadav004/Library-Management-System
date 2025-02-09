import java.util.*;
public class MinTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        MinTernary minTernary = new MinTernary();
        int min = minTernary.minimum(num1,num2);
        System.out.println("Minimum num is  "+min);
        
        sc.close();
    }
    public int minimum(int num1 , int num2){
        return (num1<num2)?num1:num2;
    }
}
