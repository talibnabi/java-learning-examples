package main;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new Logger[]{new DatabaseLogger(), new EmailLogger()});
        Customer customer = new Customer(1, "Talib", "Nabiyev");
        customerManager.add(customer);
    }

//    public class Example {
//
//    }
//
//    public static class ExampleSecond {
//
//    }
}
