package imperative;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        Integer number = incrementByFunction.apply(1);
        System.out.println(number);
    }

    private static final Function<Integer, Integer> incrementByFunction = number -> number + 1;
}
