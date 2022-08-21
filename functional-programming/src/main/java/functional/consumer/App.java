package functional.consumer;

public class App {
    public static void main(String[] args) {
        _Consumer.customerConsumer.accept(new Customer("Alisa", 508312165));
    }
}
