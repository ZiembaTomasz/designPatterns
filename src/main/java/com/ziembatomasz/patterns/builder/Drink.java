package com.ziembatomasz.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public final class Drink {
    private final String juice;
    private final String alcoholBase;
    private final int iceCubes;
    private final List<String> fruits;

    public static class DrinkBuilder {
        private String juice;
        private String alcoholBase;
        private int iceCubes;
        private List<String> fruits = new ArrayList<>();

        public DrinkBuilder juice(String juice) {
            this.juice = juice;
            return this;
        }

        public DrinkBuilder alcoholBase(String alcoholBase) {
            this.alcoholBase = alcoholBase;
            return this;
        }

        public DrinkBuilder iceCubes(int iceCubes) {
            this.iceCubes = iceCubes;
            return this;
        }

        public DrinkBuilder fruit(String fruit) {
            fruits.add(fruit);
            return this;
        }

        public Drink build() {
            return new Drink(juice, alcoholBase, iceCubes, fruits);
        }
    }

    private Drink(final String juice, final String alcoholBase, final int iceCubes, List<String> fruits) {
        this.juice = juice;
        this.alcoholBase = alcoholBase;
        this.iceCubes = iceCubes;
        this.fruits = new ArrayList<>(fruits);
    }

    public String getJuice() {
        return juice;
    }

    public String getAlcoholBase() {
        return alcoholBase;
    }

    public int getIceCubes() {
        return iceCubes;
    }

    public List<String> getFruits() {
        return fruits;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "juice='" + juice + '\'' +
                ", alcoholBase='" + alcoholBase + '\'' +
                ", iceCubes=" + iceCubes +
                ", fruits=" + fruits +
                '}';
    }
}
