import java.util.Scanner;

public class SumOfDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row of array : ");
        int row = sc.nextInt();
        System.out.print("Enter the column of array : ");
        int col = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int[][] arr = new int[row][col];
        int i = 0;
        while (i < row) {
            int j = 0;
            while (j < col) {
                arr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        int sum = sumOfDiagonal(arr);
        System.out.println("Sum is :" + sum);

        sc.close();
    }

    public static int sumOfDiagonal(int[][] arr) {
        int leftSum = sumOfLeftDiagonal(arr);
        int rightSum = sumOfRightDiagonal(arr);
        int sum = leftSum + rightSum;
        if ((arr.length % 2) != 0) {
            int idx = arr.length / 2;
            sum -= arr[idx][idx];
        }
        return sum;
    }

    public static int sumOfLeftDiagonal(int[][] arr) {
        int sum=0;
        int i=0;
        while(i<arr.length){
            sum+=arr[i][i];
            i++;
        }
        return sum;
    }

    public static int sumOfRightDiagonal(int[][] arr) {
        int sum=0;
        int i=0;
        while(i<arr.length){
            int col = arr.length-1-i;
            sum+=arr[i][col];
            i++;
        }
        return sum;
    }
}
