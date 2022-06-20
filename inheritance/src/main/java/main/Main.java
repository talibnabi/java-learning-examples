package main;

import java.util.zip.CheckedOutputStream;

public class Main {
    public static void main(String[] args) {
//        Customer customer = new Customer();
//        customer.id = 1;
//        customer.firstName = "Talib";
//        customer.lastName = "Nabi";
//        customer.nationalIdentity = "344343443";
//        customer.customerNumber = "123";
//        customer.companyName = "Alisa";
//        customer.taxNumber = "232323";
        IndividualCustomer individualCustomer = new IndividualCustomer();
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        individualCustomer.customerNumber = "1";
        corporateCustomer.customerNumber = "2";
        CustomerManager customerManager = new CustomerManager();
//        customerManager.add(individualCustomer);
//        customerManager.add(corporateCustomer);
        UnionCustomer unionCustomer = new UnionCustomer();
        unionCustomer.customerNumber = "999";
//        customerManager.add(unionCustomer);
        Customer[] customers = {individualCustomer, corporateCustomer, unionCustomer};
        customerManager.addMultiple(customers);
//        individualCustomer.customerNumber = "13";
//        individualCustomer.id = 13;
//        corporateCustomer.id = 12;
//        corporateCustomer.customerNumber = "12";
    }
}
