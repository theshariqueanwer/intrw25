package code;

@FunctionalInterface
interface FunctionalInterfaceExample {
    public int add(int a, int b);
}

public class FunctionalInterfaceExampleMain {
    static void main() {

        FunctionalInterfaceExample functionalInterfaceExample = (a, b) -> a+b;
        System.out.println(functionalInterfaceExample.add(12, 13));

    }
}
