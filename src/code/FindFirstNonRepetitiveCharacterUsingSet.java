package code;

import java.util.HashSet;
import java.util.Set;

public class FindFirstNonRepetitiveCharacterUsingSet {
    static void main() {
        String str = "swiss";
        Set<Character> charSet = new HashSet<>();
        Set<Character> repetitiveCharSet = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!charSet.add(c)) {
                repetitiveCharSet.add(c);
            }
        }

        for (char c : str.toCharArray()) {
            if (!repetitiveCharSet.contains(c)) {
                System.out.println("First non-repetitive character: " + c);
                return;
            }
        }

        System.out.println("All characters are repetitive");
    }
}
