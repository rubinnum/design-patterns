package org.example.factory;

public class CheeseburgerFactory extends BurgerFactory {

    @Override
    protected Burger makeBurger() {
        return new Cheeseburger();
    }

}
