package functional.optional;


import java.util.Optional;

public class _Optional {
    protected static void optionalExample1() {
        Optional.empty().ifPresentOrElse(System.out::println, () -> {
            System.out.println("hello");
        });
    }
}
