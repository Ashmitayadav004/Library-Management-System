import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> names =List.of("Prashant","Sachi","Kg coding");
        names.stream()
             .forEach(name->System.out.println(name));
           
    }
}
