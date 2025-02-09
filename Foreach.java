import java.util.Scanner;

public class Foreach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be counted :");
        int ele = sc.nextInt();

        for (int num : arr) {
            if (num == ele) {
                count++;
            }
        }
        System.out.println("Count is " + count);
        sc.close();
    }
}
