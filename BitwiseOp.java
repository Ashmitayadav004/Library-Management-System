import java.util.*;
public class BitwiseOp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a =sc.nextInt();
        System.out.print("Enter the first number : ");
        int b =sc.nextInt();
        int and = a & b;
        System.out.println("Result of and : "+and);

        int or = a | b;
        System.out.println("Result of or : "+or);
        int xor = a ^ b;
        System.out.println("Result of xor : "+xor);
        int not =  ~b;
        System.out.println("Result of not : "+not);
        int left = a<<1;
        System.out.println("Result of left : "+left);
        int  right= a>>1;
        System.out.println("Result of right : "+right);
        sc.close();
    }
}
