import java.util.*;
public class Sum2dArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the row of array : ");
    int row = sc.nextInt();
    System.out.print("Enter the column of array : ");
    int col = sc.nextInt();
    System.out.println("Enter the elements of array : ");
    int[][] arr = new int[row][col];
    int i=0;
    while(i<row){
        int j=0;
        while(j<col){
            arr[i][j]=sc.nextInt();
            j++;
        }
        i++;
    }
    System.out.println("Sum is "+sum(arr));
    System.out.println("avg is "+avg(arr));
    sc.close();
  }  
  public static int sum(int[][] arr){
    int sum=0;
    int i=0;
    while(i<arr.length){
        int j=0;
        while(j<arr.length){
            sum+=arr[i][j];
            j++;
        }
        i++;
    }
    return sum;
  }
  public static int avg(int[][] arr){
    int avg = sum(arr)/arr.length;
    return avg;
  }
}
