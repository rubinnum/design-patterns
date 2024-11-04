package org.example.abstractfactory;

public class Cheeseburger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing cheeseburger...");
    }
}
