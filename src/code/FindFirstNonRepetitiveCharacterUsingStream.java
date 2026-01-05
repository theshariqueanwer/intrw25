package code;

public class FindFirstNonRepetitiveCharacterUsingStream {
    static void main() {
        String str = "swwiiss";
        str.chars()
           .mapToObj(c -> (char) c)
           .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
           .findFirst()
           .ifPresentOrElse(
               c -> System.out.println("First non-repetitive character: " + c),
               () -> System.out.println("All characters are repetitive")
           );
    }
}
