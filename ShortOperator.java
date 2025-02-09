import java.util.*; // Importing the java.util package for using Scanner

public class ShortOperator { // Declaring the class named Operator
    public static void main(String[] args) { // Main method
        int a = 5; // Initializing variable a with the value 5
        Scanner sc = new Scanner(System.in); // Creating a Scanner object for input
        int x1 = sc.nextInt(); // Reading the first integer input
        a += x1; // Adding the first input to a
        System.out.println(a); // Printing the updated value of a
        int x2 = sc.nextInt(); // Reading the second integer input
        a += x2; // Adding the second input to a
        System.out.println(a); // Printing the updated value of a
        int x3 = sc.nextInt(); // Reading the third integer input
        a += x3; // Adding the third input to a
        System.out.println(a); // Printing the updated value of a
        int x4 = sc.nextInt(); // Reading the fourth integer input
        a += x4; // Adding the fourth input to a
        System.out.println(a); // Printing the updated value of a
        sc.close(); // Closing the Scanner
    }
}
