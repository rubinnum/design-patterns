package org.example.abstractfactory;

public class ItalianCheeseburger implements ItalianBurger {

    @Override
    public void prepare() {
        System.out.println("Preparing italian cheeseburger...");
    }

}
