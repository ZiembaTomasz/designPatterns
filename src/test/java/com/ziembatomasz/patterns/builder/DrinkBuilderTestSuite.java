package com.ziembatomasz.patterns.builder;

import org.junit.Assert;
import org.junit.Test;

public class DrinkBuilderTestSuite {
    @Test
    public void testDrinkBuilder() {
        //Given
        Drink drink = new Drink.DrinkBuilder()
                .juice("Strawberry")
                .alcoholBase("gin")
                .iceCubes(5)
                .fruit("orange")
                .fruit("lemon")
                .fruit("Strawberry")
                .build();
        //When
        int howManyFruits = drink.getFruits().size();
        //Given
        Assert.assertEquals(3, howManyFruits);
    }
}
