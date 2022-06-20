package main;

import business.abstracts.ProductService;
import business.concretes.ProductManager;
import core.concretes.JLoggerManagerAdapter;
import dataAccess.concretes.AbcProductDao;
import entities.concretes.Product;
import jLogger.JLoggerManager;

public class Main {
    //ToDo Spring IoC
    public static void main(String[] args) {
        //ProductService productService = new ProductManager(new HibernateProductDao());
        ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter(new JLoggerManager()));
        Product product = new Product(1, 2, "computer", 12, 50);
        productService.add(product);
    }
}
