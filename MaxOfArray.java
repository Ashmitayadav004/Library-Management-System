import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of arrays : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Max is : " + max(arr, size));
        System.out.println();
        System.out.print("Min is : " + min(arr, size));

        sc.close();
    }

    public static int max(int[] arr, int size) {
        int max1 = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];

            }
        }
        return max1;
    }

    public static int min(int[] arr, int size) {
        int min1 = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] < min1) {
                min1 = arr[i];

            }
        }
        return min1;
    }
}
