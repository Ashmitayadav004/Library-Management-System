import java.util.*;
public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter the command");
            String command = sc.nextLine();
            if(command.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("Successfully exit");
        sc.close();
    }
}
