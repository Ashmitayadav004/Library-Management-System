import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size  of row ");
        int row = sc.nextInt();
        System.out.println("Enter the  size of column ");
        int cols = sc.nextInt();
        int[][] arr = new int[row][cols];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println("\n");
        }
        System.out.println("the elements of array :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println("\n");
        }
        sc.close();
    }

}
