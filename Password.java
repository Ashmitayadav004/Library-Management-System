import java.util.*;
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        do{
            System.out.println("Enter the password");
             password=sc.next();


        }while(!isPassword(password));
        System.out.println("Thanks for password");
        sc.close();
    }
    public static boolean isPassword(String password){
        return (password.length()>6);
    }
    
}
