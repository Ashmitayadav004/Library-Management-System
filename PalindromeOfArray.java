import java.util.Scanner;

public class PalindromeOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of arrays : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isPal = isPalindrome(arr);
        if (isPal) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        sc.close();
    }

    public static boolean isPalindrome(int[] arr) {
        int i = 0;
        while (i < (arr.length / 2)) {
            
            if(arr[i] != arr[(arr.length - 1) - i]){
                return false;
            }
            
            i++;
        }
        return true;
    }
}