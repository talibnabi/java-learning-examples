package functional.combinatorPattern;

import java.time.LocalDate;

public class Customer {
    private final String username;
    private final String email;
    private final String phoneNumber;
    private final LocalDate DOB;

    public Customer(String username, String email, String phoneNumber, LocalDate DOB) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.DOB = DOB;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", DOB=" + DOB +
                '}';
    }
}
