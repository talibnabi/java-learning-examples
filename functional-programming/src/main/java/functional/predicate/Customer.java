package functional.predicate;

public class Customer {
    private final String customerName;
    private final Integer customerPhoneNumber;

    public Customer(String customerName, Integer customerPhoneNumber) {
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Integer getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerPhoneNumber=" + customerPhoneNumber +
                '}';
    }
}
