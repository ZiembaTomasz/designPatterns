package com.ziembatomasz.patterns.factory;

public class BurgerFactory {
    public static final String CHILLI = "CHILLI";
    public static final String VEGE = "VEGE";
    public static final String CHEESE = "CHEESE";

    public final Burger makeBurger(final String burgerClass) {
        switch (burgerClass) {
            case CHILLI:
                return new ChilliBurger("Chilli Burger ordered");
            case VEGE:
                return new VegeBurger("Vege Burger ordered");
            case CHEESE:
                return new CheeseBurger("Cheese Burger ordered");
            default:
                return null;
        }
    }
}
