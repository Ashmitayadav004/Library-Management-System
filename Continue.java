import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int num : arr) {
            if (num < 5) {
                continue;
            }
            sum += num;
        }
        System.out.println("Answer is " + sum);
        sc.close();
    }

}