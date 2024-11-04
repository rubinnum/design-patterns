package org.example.abstractfactory;

public abstract class BurgerFactory {

    public Burger orderBurger() {
        Burger burger = makeBurger();
        burger.prepare();
        return burger;
    }

    protected abstract Burger makeBurger();

    protected abstract ItalianBurger makeItalianBurger();

}
