package com.example.java26.oop;

public class Product {
    private String name;
    private double price;
    private int stockQuantity;


    public Product (String name, double price, int stockQuantity){

        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double totalValue() {
        return price*stockQuantity;
    }
}
