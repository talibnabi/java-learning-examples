package functional.combinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidation {
    private boolean validUsername(String username) {
        return username.equalsIgnoreCase("TALIB");
    }

    private boolean validEmail(String email) {
        return email.contains("@");
    }

    private boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber.startsWith("+994");
    }

    private boolean validDOB(LocalDate DOB) {
        return Period.between(DOB, LocalDate.now()).getYears() >= 18;
    }

    protected boolean isValid(Customer customer) {
        return validUsername(customer.getUsername())
                && validEmail(customer.getEmail())
                && validPhoneNumber(customer.getPhoneNumber())
                && validDOB(customer.getDOB());
    }
}
