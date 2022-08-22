package functional.combinationPattern2;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {
    static CustomerRegistrationValidator isValidUsername() {
        return customer -> customer
                .getUsername()
                .equalsIgnoreCase("TALIB") ? ValidationResult.SUCCESS :
                ValidationResult.USERNAME_NOT_VALID;
    }

    static CustomerRegistrationValidator isValidEmail() {
        return customer -> customer
                .getEmail()
                .contains("@") ? ValidationResult.SUCCESS :
                ValidationResult.EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidator isValidPhoneNumber() {
        return customer -> customer
                .getPhoneNumber()
                .startsWith("+994") ? ValidationResult.SUCCESS :
                ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidator isValidDOB() {
        return customer ->
                Period.between(customer.getDOB(), LocalDate.now())
                        .getYears() >= 18 ? ValidationResult.SUCCESS :
                        ValidationResult.IS_NOT_AN_ADULT;
    }

    default  CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
        return customer ->
                this.apply(customer).equals(ValidationResult.SUCCESS) ? other.apply(customer) :
                        this.apply(customer);
    }
}
