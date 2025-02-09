import java.util.*;

public class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of arrays : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element : ");
        int ele = sc.nextInt();
        System.out.print("Occurrence is : " + occur(arr, size, ele));

        sc.close();
    }

    public static int occur(int[] arr, int size, int ele) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == ele) {
                count++;
            }
        }
        return count;
    }
}
