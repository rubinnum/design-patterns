package org.example.factory;

public class Cheeseburger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing cheeseburger...");
    }
}
