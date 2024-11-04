package org.example.abstractfactory;

public class CheeseburgerFactory extends BurgerFactory {

    @Override
    protected Burger makeBurger() {
        return new Cheeseburger();
    }

    @Override
    protected ItalianBurger makeItalianBurger() {
        return new ItalianCheeseburger();
    }

}
