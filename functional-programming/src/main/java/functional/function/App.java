package functional.function;

public class App {
    public static void main(String[] args) {
        Integer number = _Function.incrementNumber.apply(1);
        String number2 = _Function.incrementNumber2.apply(3);
        Integer multiplyNumber = _Function.multiplyNumber.apply(10);
        Integer number3 = _Function.multiplyNumber.andThen(_Function.incrementNumber).apply(3);
        Integer number4 = _Function.incrementNumber.compose(_Function.multiplyNumber).apply(3);
        Integer number5 = _Function.incrementNumber.andThen(_Function.multiplyNumber).apply(4);
        Integer number6 = _Function.addAndMultiply.apply(number, multiplyNumber);
        System.out.println(number6);
    }
}
