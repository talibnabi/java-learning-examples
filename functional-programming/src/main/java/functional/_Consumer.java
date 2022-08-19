package functional;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        customerConsumer.accept(new Customer("Alisa", "99999"));
    }

    private static final Consumer<Customer> customerConsumer = customer -> System.out.println(customer.toString());
}
