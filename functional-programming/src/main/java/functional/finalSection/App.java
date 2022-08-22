package functional.finalSection;

import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        hello("Alisa", null, name -> System.out.println("lastname does not exists for " + name));
    }

    private static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }
}
