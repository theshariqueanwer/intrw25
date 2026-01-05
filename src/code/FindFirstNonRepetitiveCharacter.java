package code;

public class FindFirstNonRepetitiveCharacter {
    static void main() {
        String str = "swiss";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println("First non-repetitive character: " + c);
                return;
            }
        }
        System.out.println("All characters are repetitive");
    }
}
