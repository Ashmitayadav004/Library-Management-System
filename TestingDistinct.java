import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 2, 2, 2, 4, 4, 5, 5, 6, 6, 6, 6, 7, 8, 9, 3);
       List<Integer> numbers = nums.stream()
                .distinct()
                .collect(Collectors.toList());
                System.out.println(nums);
                System.out.println(numbers);
    }
}
