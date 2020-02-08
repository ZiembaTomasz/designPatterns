package com.ziembatomasz.patterns.factory;

import org.junit.Assert;
import org.junit.Test;

public class FactoryTestSuite {
    @Test
    public void shouldOrderBurger() {
        //Given
        BurgerFactory chilli = new BurgerFactory();
        BurgerFactory vege = new BurgerFactory();
        BurgerFactory cheese = new BurgerFactory();
        //When
        Burger chilliBurger = chilli.makeBurger(BurgerFactory.CHILLI);
        Burger vegeBurger = vege.makeBurger(BurgerFactory.VEGE);
        Burger cheeseBurger = cheese.makeBurger(BurgerFactory.CHEESE);
        //Then
        Assert.assertEquals("Chilli Burger ordered", chilliBurger.getName());
        Assert.assertEquals("Vege Burger ordered", vegeBurger.getName());
        Assert.assertEquals("Cheese Burger ordered", cheeseBurger.getName());
    }
}
