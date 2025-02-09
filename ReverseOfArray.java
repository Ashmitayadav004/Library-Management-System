import java.util.Scanner;

public class ReverseOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of arrays : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        System.out.println("Reverse array :" );
        display(arr);

        sc.close();
    }

    public static void reverse(int[] arr) {
        int i = 0;
        while (i < (arr.length / 2)) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }

    public static void display(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
