package org.example.abstractfactory;

public class HamburgerFactory extends BurgerFactory {

    @Override
    protected Burger makeBurger() {
        return new Hamburger();
    }

    @Override
    protected ItalianBurger makeItalianBurger() {
        return new ItalianHamburger();
    }

}
