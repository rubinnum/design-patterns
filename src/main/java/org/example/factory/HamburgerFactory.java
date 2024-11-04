package org.example.factory;

public class HamburgerFactory extends BurgerFactory {

    @Override
    protected Burger makeBurger() {
        return new Hamburger();
    }

}
