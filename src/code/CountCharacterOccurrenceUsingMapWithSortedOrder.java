package code;

import java.util.*;
import java.util.stream.Collectors;

public class CountCharacterOccurrenceUsingMapWithSortedOrder {
    static void main() {
        String input = "hello world";

        Map<Character, Long> characterFrequency = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(c -> c, TreeMap::new, Collectors.counting()));
        System.out.println(characterFrequency);
    }
}
