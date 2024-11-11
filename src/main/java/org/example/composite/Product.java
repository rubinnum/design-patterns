package org.example.composite;

public class Product implements Item {
    protected String title;
    protected final double price;

    public Product(String title, double price) {
        this.price = price;
        this.title = title;
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }

    public double getPrice() {
        return price;
    }
}
