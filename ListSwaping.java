import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ListSwaping {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(list);
        swap(list, 0, 6);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }

    public static void swap(List<Integer> list, int x, int y) {
        int swap = list.get(x);
        list.set(x, list.get(y));
        list.set(y, swap);
    }

    public static void reverse(List<Integer> list) {
        int n = list.size();
        // Collections.reverse(list);
        for (int i = 0; i < list.size() / 2; i++) {
            ListSwaping.swap(list, i, (n - 1) - i);
        }
    }
}
