import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        if ((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Year is a leap year");
        }
        // } else if (year % 4 == 0 && year % 100 != 0) {
        //     System.out.println("Year is a leap year");
        // } 
        else {
            System.out.println("Year is not a leap year");
        }
        sc.close();
    }
}
