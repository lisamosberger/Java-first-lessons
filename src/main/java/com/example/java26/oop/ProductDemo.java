package com.example.java26.oop;

public class ProductDemo {

    static void main (){

        Product product1 = new Product("Cornflakes", 15.12, 3);
        Product product2 = new Product("Bread", 20.00, 8);
        Product product3 = new Product("Milk", 18.99, 10);

        IO.println(product1.getName() + ": " + product1.totalValue());
        IO.println(product2.getName() + ": " + product2.totalValue());
        IO.println(product3.getName() + ": " + product3.totalValue());

        double total = product1.totalValue()
                + product2.totalValue()
                + product3.totalValue();

        IO.println("Totalt Värde: " + total);
    }
}
