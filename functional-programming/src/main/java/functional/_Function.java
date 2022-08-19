package functional;


import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
//        System.out.println(functionSimpleIncr(2));
//        System.out.println(incrementByOne.apply(1));
//        int numberInc = incrementByOne.apply(1);
//        int multiply = multiply10.apply(numberInc);
//        Function<Integer, Integer> multiply2 = multiply10.andThen(multiply10);
//        System.out.println(multiply2.apply(multiply));
//        System.out.println(multiply);
//        Integer number = biFuncAddAndMultiply.apply(10, 11);
//        System.out.println(number);
    }

    private static int functionSimpleIncr(int number) {
        return number + 1;
    }

    private static final Function<Integer, Integer> incrementByOne = number -> number + 1;
    private static final Function<Integer, Integer> multiply10 = number -> number * 10;
    private static final BiFunction<Integer, Integer, Integer> biFuncAddAndMultiply =
            (numberForAdd, numberForMultiply) -> (numberForAdd + 1) * numberForMultiply;
}
