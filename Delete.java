import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of arrays : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to delete : ");
        int del = sc.nextInt();
        int[] newArr = delete(arr, size, del);
        System.out.println("Deleted array : ");
        display(newArr);
        sc.close();
    }

    public static int[] delete(int[] arr, int size, int del) {
        int count = Occurrence.occur(arr, size, del);
        int newsize = (arr.length - count);
        int[] newarr = new int[newsize];
        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] != del) {
                newarr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newarr;

    }

    public static void display(int[] newArr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
        sc.close();
    }
}
