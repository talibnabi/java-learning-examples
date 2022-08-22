package functional.lambda;

import java.util.Locale;
import java.util.function.BiFunction;

public class Lambdas {
    protected static final BiFunction<String, Integer, String> biFunctionLambda =
            (name, age) -> {
                if (name.isBlank()) {
                    throw new IllegalArgumentException("name is blank");
                }
                System.out.println(age);
                return name.toUpperCase(Locale.ROOT);
            };
}
