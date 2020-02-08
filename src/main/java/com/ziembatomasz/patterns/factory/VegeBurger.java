package com.ziembatomasz.patterns.factory;

public class VegeBurger implements Burger {
    final String name;

    public VegeBurger(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
