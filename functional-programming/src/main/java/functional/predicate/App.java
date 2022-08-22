package functional.predicate;

public class App {
    public static void main(String[] args) {
        boolean check = _Predicate.isValidPhoneNumberStartAndLen.test("0708312165");
        System.out.println(check);
    }
}
