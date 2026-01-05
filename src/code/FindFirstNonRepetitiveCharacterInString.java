package code;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepetitiveCharacterInString {
    public static void main(String[] args) {

        String str = "successful";
        char firstNonRepetitive = findFirstNonRepetitiveChar(str);
        if (firstNonRepetitive != 0) {
            System.out.println("The first non-repetitive character in '" + str + "' is: " + firstNonRepetitive);
        } else {
            System.out.println("No non-repetitive character found in '" + str + "'.");
        }

        str = "aabbcc";
        firstNonRepetitive = findFirstNonRepetitiveChar(str);
        if (firstNonRepetitive != 0) {
            System.out.println("The first non-repetitive character in '" + str + "' is: " + firstNonRepetitive);
        } else {
            System.out.println("No non-repetitive character found in '" + str + "'.");
        }

        str = "stress";
        firstNonRepetitive = findFirstNonRepetitiveChar(str);
        if (firstNonRepetitive != 0) {
            System.out.println("The first non-repetitive character in '" + str + "' is: " + firstNonRepetitive);
        } else {
            System.out.println("No non-repetitive character found in '" + str + "'.");
        }
    }

    public static char findFirstNonRepetitiveChar(String str) {
        Map<Character, Integer> charCounts = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0; // Return null character if no non-repetitive character is found
    }
}
