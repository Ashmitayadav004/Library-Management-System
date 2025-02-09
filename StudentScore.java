import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int score = sc.nextInt();
        String result = (score > 80) ? "High" : (score > 50 ? "Moderate" : "Low");
        System.out.println("Score is " + result);
        sc.close();
    }
}
