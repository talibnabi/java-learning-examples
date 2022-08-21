package functional.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    protected static final Function<Integer, Integer> incrementNumber = number -> number + 1;
    protected static final Function<Integer, String> incrementNumber2 = number -> String.valueOf(number + 1);
    protected static final Function<Integer, Integer> multiplyNumber = number -> number * 10;
    protected static final BiFunction<Integer, Integer, Integer> addAndMultiply = (numberAdd, numberMultiply) -> (numberAdd + 1) * (numberMultiply + 10);

}
