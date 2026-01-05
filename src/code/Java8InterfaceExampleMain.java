package code;

interface Java8InterfaceExample {
    default void show() {
        System.out.println("Default Method in Interface");
    }

    static void display() {
        System.out.println("Static Method in Interface");
    }

    void message();
}

class Java8InterfaceExampleImpl implements Java8InterfaceExample {
    @Override
    public void show() {
        Java8InterfaceExample.super.show();
    }

    @Override
    public void message() {
        System.out.println("Abstract Method Implementation");
    }

}

public class Java8InterfaceExampleMain {

    static void main(String[] args) {
        Java8InterfaceExampleImpl obj1 = new Java8InterfaceExampleImpl();
        obj1.show();
        obj1.message();
        Java8InterfaceExample.display();

        Java8InterfaceExample obj2 = new Java8InterfaceExample() {
            @Override
            public void message() {
                System.out.println("Anonymous Class Implementation of Abstract Method");
            }
        };
        obj2.show();
        obj2.message();
        Java8InterfaceExample.display();
    }


}
