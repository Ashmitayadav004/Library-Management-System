
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (max < num) {
                max = num;
            }
        }
        
        System.out.println("Max: " + max);
        
        sc.close(); // Close the scanner to avoid resource leaks
    }
}
