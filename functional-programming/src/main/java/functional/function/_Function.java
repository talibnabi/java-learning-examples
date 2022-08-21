package functional.function;

import java.util.function.Function;

public class _Function {
    protected static final Function<Integer, Integer> incrementNumber = number -> number + 1;
    protected static final Function<Integer, String> incrementNumber2 = number -> String.valueOf(number + 1);
    protected static final Function<Integer, Integer> multiplyNumber = number -> number * 10;
    
}
