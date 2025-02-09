import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern : ");
        int rows = sc.nextInt();
        pattern1(rows);
        pattern2(rows);
        
        sc.close();
    }

    public static void pattern1(int maxrows) {
        int rows=0;
        while(rows<maxrows){
            System.out.print(" *");
            int i=0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }

    }

    public static void pattern2(int maxrows) {
        System.out.println();
        int rows=maxrows;
        while(rows>0){
            
            int i=0;
            while(i<rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    
}
