package functional.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    protected static final Consumer<Customer> customerConsumer = customer ->
            System.out.println("Hello," + customer.getCustomerName() + ",thanks for registering with phone number: " + customer.getCustomerPhoneNumber());
    protected static final BiConsumer<Customer, Boolean> biCustomerConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello," + customer.getCustomerName() + ",thanks for registering with phone number: " + (showPhoneNumber ? customer.getCustomerPhoneNumber() : "********"));
}
