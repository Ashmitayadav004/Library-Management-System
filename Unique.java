import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Unique {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your string");
        String usr = sc.nextLine();
        for (char ch : usr.toCharArray()) {
            unique.add(ch);
        }
        System.out.println(unique.size());
    }
}
