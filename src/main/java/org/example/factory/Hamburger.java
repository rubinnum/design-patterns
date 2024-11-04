package org.example.factory;

public class Hamburger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing hamburger...");
    }
}