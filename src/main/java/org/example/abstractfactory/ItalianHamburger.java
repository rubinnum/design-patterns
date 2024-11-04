package org.example.abstractfactory;

public class ItalianHamburger implements ItalianBurger {

    @Override
    public void prepare() {
        System.out.println("Preparing italian hamburger...");
    }

}
