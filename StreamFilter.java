import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> strs = List.of("Ashmita ", "Yadav is", " a best ", "programmer", " in google",
                "HIEEEEEEEEEEEEEEEE",
                "BYEEEEEEEEEEEEEEEEEEE", "Mummmy", "Papa");
        String result = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce(" ", (a, b) -> a + " " + b);
        System.out.println(result);
    }
}
