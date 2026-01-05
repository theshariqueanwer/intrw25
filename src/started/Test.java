package started;

import java.util.stream.IntStream;

public class Test {
    static void main() {
        IntStream.iterate(2, i -> i + 1)
                // .filter(Test::isPrime)
                .filter(n -> isPrime(n))
                .limit(10)
                .forEach(System.out::println);
    }


    private static boolean isPrime(int number) {
        return number > 1
                &&
                IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .allMatch(n -> number % n != 0);
    }
}
