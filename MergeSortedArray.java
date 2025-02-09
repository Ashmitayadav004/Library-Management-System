import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array1 : ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];

        System.out.println("Enter the elements of array1 : ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of array2 : ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        System.out.println("Enter the elements of array2 : ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] newArr = merge(arr1, arr2);
        display(newArr);
        sc.close();
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int newSize = (arr1.length + arr2.length);
        int[] newarr = new int[newSize];
        int i = 0, j = 0, k = 0;
        while ((i < arr1.length) || (j < arr2.length)) {
            if (j == arr2.length ||
                    (i < arr1.length && arr1[i] < arr2[j])) {
                newarr[k] = arr1[i];
                k++;
                i++;
            } else {
                newarr[k] = arr2[j];
                k++;
                j++;
            }
        }

        return newarr;
    }

    public static void display(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}



// import java.util.Scanner;

// public class MergeSortedArray {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the size of array1: ");
// int size1 = sc.nextInt();
// int[] arr1 = new int[size1];

// System.out.println("Enter the elements of array1: ");
// for (int i = 0; i < size1; i++) {
// arr1[i] = sc.nextInt();
// }

// System.out.print("Enter the size of array2: ");
// int size2 = sc.nextInt();
// int[] arr2 = new int[size2];

// System.out.println("Enter the elements of array2: ");
// for (int i = 0; i < size2; i++) {
// arr2[i] = sc.nextInt();
// }

// int[] newArr = merge(arr1, arr2);
// display(newArr);
// sc.close();
// }

// public static int[] merge(int[] arr1, int[] arr2) {
// int newSize = arr1.length + arr2.length;
// int[] newarr = new int[newSize];
// int i = 0, j = 0, k = 0;

// while (i < arr1.length && j < arr2.length) {
// if (arr1[i] < arr2[j]) {
// newarr[k] = arr1[i];
// i++;
// } else {
// newarr[k] = arr2[j];
// j++;
// }
// k++;
// }

// // Copy remaining elements of arr1, if any
// while (i < arr1.length) {
// newarr[k] = arr1[i];
// i++;
// k++;
// }

// // Copy remaining elements of arr2, if any
// while (j < arr2.length) {
// newarr[k] = arr2[j];
// j++;
// k++;
// }

// return newarr;
// }

// public static void display(int[] arr) {
// System.out.println("Merged Array: ");
// for (int value : arr) {
// System.out.print(value + " ");
// }
// System.out.println(); // For a new line after displaying the array
// }
// }
