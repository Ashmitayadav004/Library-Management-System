import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of arrays : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isInc = isIncreasing(arr, size);
        boolean isDec = isDecreasing(arr, size);
        if (isInc || isDec) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
        sc.close();
    }

    public static boolean isDecreasing(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIncreasing(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
