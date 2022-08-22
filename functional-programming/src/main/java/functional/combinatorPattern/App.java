package functional.combinatorPattern;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        CustomerValidation validation = new CustomerValidation();
        boolean check = validation.isValid(new Customer(
                "Talib",
                "talibnabi@gmail.com",
                "+994508312165",
                LocalDate.of(2001, 12, 02)
        ));
        System.out.println(check);
    }
}
