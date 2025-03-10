import java.time.LocalTime;
import java.util.*;

@FunctionalInterface
interface Greetable {
    void greet(String personName); // Abstract method (only one allowed in a functional interface)
}

public class DAY10_Q1 {
    public static void main(String[] args) {
        // Using a lambda expression to implement the Greetable interface
        Greetable obj = (personName) -> {
            System.out.println("Welcome to " + personName);
        };

        obj.greet("Navya");
        obj.greet("Nayanika");

        // Example using a method reference (if you had a suitable method)
        // obj = System.out::println; //  This won't work directly because println takes only one argument
        // obj.greet("Everyone");

        // Example using an anonymous class (less common with functional interfaces)
        Greetable obj2 = new Greetable() {
            @Override
            public void greet(String personName) {
                System.out.println("Hello, " + personName + "!");
            }
        };

        obj2.greet("Anonymous");
    }
}
