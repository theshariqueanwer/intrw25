package code;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepetitiveCharacterUsingMap {
    static void main() {
        String str = "swiss";

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                System.out.println("First non-repetitive character: " + c);
                return;
            }
        }

        System.out.println("All characters are repetitive");
    }
}
