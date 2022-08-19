package functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
//        customerConsumer.accept(new Customer("Alisa", "99999"));
        customerConsumerV.accept(new Customer("Alisa", "99999"), true);
    }

    private static final Consumer<Customer> customerConsumer = customer -> System.out.println(customer.toString());
    private static final BiConsumer<Customer, Boolean> customerConsumerV =
            (customer, check) -> System.out.println(customer.getCustomerName() + " " + (check ? customer.getCustomerPhone() : "10"));
}
