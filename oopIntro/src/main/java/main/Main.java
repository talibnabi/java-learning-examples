package main;

public class Main {
    public static void main(String[] args) {
        //SOLID principles
        //1.Single Responsibility
        //2.Open-Closed
        //3.Liskov Substitution
        //4.Interface Segregation
        //5.Dependency Inversion

        //don't repeat yourself
        //didn't work
//        String[] products = {
//                "Lenovo v14",
//                "Lenovo v15",
//                "HP 5"
//        };
//        int[] unitsInStock = {
//                3,
//                4,
//                5
//        };
        Product product1 = new Product();//object,reference,instance creation
        product1.setId(1);
        product1.setName("Lenovo v14");
        product1.setDetail("16gb ram");
        product1.setDiscount(10);
        product1.setUnitPrice(16000);
        System.out.println(product1.getUnitPriceAfterDiscount());
//        product1.id = 1;
//        product1.name = "Lenovo 14";
//        product1.unitPrice = 15000;
//        product1.detail = "16gb ram";
//        product1.discount = 10;
//
//        Product product2 = new Product();//object,reference,instance creation
//        product2.id = 2;
//        product2.name = "Lenovo 15";
//        product2.unitPrice = 23000;
//        product2.detail = "32gb ram";
//        product2.discount = 29;
//
//        Product product3 = new Product();//object,reference,instance creation
//        product3.id = 3;
//        product3.name = "Lenovo 16";
//        product3.unitPrice = 35000;
//        product3.detail = "64gb ram";
//        product3.discount = 21;
        Product product4 = new Product(4, "Lenovo 26", 30000, "128GB", 10);
        System.out.println(product4.getUnitPriceAfterDiscount());

//        Product[] products = {
//                product1, product2, product3, product4
//        };

//        ProductManager productManager = new ProductManager();
//        productManager.addToCart(product1);
//        productManager.addToCart(product2);
//        productManager.addToCart(product3);
//        productManager.addToCart(product4);
//
//
//        for (Product product : products) {
//            System.out.println(product.name);
//        }
//        System.out.println(products.length);
//
//        Category category1 = new Category();
//        category1.id = 1;
//        category1.name = "computer";
//
//        Category category2 = new Category();
//        category2.id = 2;
//        category2.name = "house";
        Category category = new Category();
        category.setId(1);
        category.setName("Food");
        System.out.println(category.getId()+" . "+category.getName());
    }
}
