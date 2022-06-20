package main;

public class CustomerManager {
    //SOLID -Open Closed Principle
    //polymorphism
    public void add(Customer customer) {
        if (customer instanceof IndividualCustomer) {
            System.out.println(customer.customerNumber + " added.");

        } else if (customer instanceof CorporateCustomer) {
            System.out.println(customer.customerNumber + " added.");
        } else {
            System.out.println("i don't know.");
        }
    }

    //bulk insert
    public void addMultiple(Customer[] customers) {
        for (Customer customer : customers) {
            add(customer);
        }
    }

    public void add(IndividualCustomer customer) {
        System.out.println(customer.customerNumber + " added.");
    }

    public void add(CorporateCustomer customer) {
        System.out.println(customer.customerNumber + " added.");
    }
}
