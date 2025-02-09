import java.util.*;

public class Search2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of array : ");
        int row = sc.nextInt();
        System.out.print("Enter the  column of array : ");
        int col = sc.nextInt();
        System.out.println("Enter the elements of array ");
        int[][] arr = new int[row][col];
        int i = 0;
        while (i < row) {
            int j = 0;
            while (j < col) {
                arr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        System.out.print("Enter the element to search : ");
        int ele = sc.nextInt();

        boolean isFound = search(arr, ele);
        if (isFound) {
            System.out.println("Found");
        } else {
            System.out.println("not found");
        }
        sc.close();
    }

    public static boolean search(int[][] arr, int ele) {
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr.length) {
                if (arr[i][j] == ele) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
