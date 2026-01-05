package code;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurrenceUsingMap {
    static void main() {
        String input = "hello world";

        Map<Character, Integer>  characterFrequency = new HashMap<>();

        for (char c: input.toCharArray()) {
            if(c != ' ') {
                characterFrequency.put(c, characterFrequency.getOrDefault(c , 0) +1);
            }
        }
        System.out.println(characterFrequency);
    }
}
