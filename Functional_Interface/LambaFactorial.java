package Functional_Interface;

import java.util.stream.IntStream;

public class LambaFactorial {
    public static void main(String[] args) {
        IntStream.rangeClosed(2, 9)
                .reduce((a, b) -> a * b)
                .ifPresent(System.out::println);

        // .forEach(System.out::println);

    }
}
