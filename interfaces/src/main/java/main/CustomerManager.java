package main;

public class CustomerManager {
    //loosely couples
    //tightly couples
    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer) {
        System.out.println("customer was added: " + customer.getFirstName());
        Utils.runLoggers(loggers,customer.getFirstName());
    }

    public void delete(Customer customer) {
        System.out.println("customer was deleted: " + customer.getFirstName());


    }

    public Logger[] getLogger() {
        return loggers;
    }

    public void setLogger(Logger[] logger) {
        this.loggers = loggers;
    }
}
