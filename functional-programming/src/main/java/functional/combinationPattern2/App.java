package functional.combinationPattern2;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Customer customer =
                new Customer("Talib", "tlbnbnabi@gmail.com",
                        "+994508312165", LocalDate.of(2001, 12, 2));
        ValidationResult result = CustomerRegistrationValidator.isValidUsername()
                .and(CustomerRegistrationValidator.isValidEmail())
                .and(CustomerRegistrationValidator.isValidDOB())
                .and(CustomerRegistrationValidator.isValidPhoneNumber())
                .apply(customer);
        System.out.println(result);
    }
}
