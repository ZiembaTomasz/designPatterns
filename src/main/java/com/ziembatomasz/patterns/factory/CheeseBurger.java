package com.ziembatomasz.patterns.factory;

public class CheeseBurger implements Burger {
    final String name;

    public CheeseBurger(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
