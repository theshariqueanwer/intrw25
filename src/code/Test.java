package code;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie");

        List<String> inUpperCase = new ArrayList<>();

        for (String name : names) {
            inUpperCase.add(name.toUpperCase());
        }

        for (int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).toUpperCase());
        }
        System.out.println(names.size());
        System.out.println(inUpperCase.size());
    }
}
