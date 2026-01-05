package code;

interface FunctionalInterfaceWithGenericExample<T> {
    public T add(T a, T b);
}


public class FunctionalInterfaceWithGenericExampleMain {

    static void main() {
        FunctionalInterfaceWithGenericExample<Integer> integerFunctionalInterfaceWithGenericExample = (a, b) -> a + b;
        System.out.println(integerFunctionalInterfaceWithGenericExample.add(25, 35));
    }

}
