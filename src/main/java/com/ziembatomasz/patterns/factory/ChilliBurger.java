package com.ziembatomasz.patterns.factory;

public class ChilliBurger implements Burger {

    final String name;

    public ChilliBurger(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
