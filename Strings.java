import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        String name = new String();
        name = sc.nextLine();
        System.out.println("The name is : ");
        System.out.println(name);

        System.out.println("Enter the name1 :");
        String name1 = new String();
        name1 = sc.nextLine();
        System.out.println("The name1 is : ");
        System.out.println(name1);

        if (name.compareTo(name1) == 0) {
            System.out.println("equal");
        }

        else {
            System.out.println("not equal");
        }

        for (

                int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        sc.close();
    }
}
