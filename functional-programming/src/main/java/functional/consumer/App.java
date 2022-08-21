package functional.consumer;

public class App {
    public static void main(String[] args) {
//        _Consumer.customerConsumer.accept(new Customer("Alisa", 508312165));
        _Consumer.biCustomerConsumer.accept(new Customer("Alisa", 508312165), false);
        _Consumer.biConsumerExample.accept("Alisa", 1);
    }
}
