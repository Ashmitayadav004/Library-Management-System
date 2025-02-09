import java.util.List;

public class StreamPrint {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 33, 23, 23, 22, 44, 56, 77, 87, 11, 13, 15, 19);
        nums.stream()
                .filter(num -> (num % 2 == 1))
                .forEach(num -> System.out.println(num));
    }
}
