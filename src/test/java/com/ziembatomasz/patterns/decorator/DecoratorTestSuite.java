package com.ziembatomasz.patterns.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

public class DecoratorTestSuite {
    @Test
    public void shouldGetCost() {
        //Given
        FlowerMail flowerMail = new BasicBouquet();
        flowerMail = new TulipOrder(flowerMail);
        flowerMail = new GrassOrder(flowerMail);
        //When
        BigDecimal theCost = flowerMail.getCostOfBouquet();
        //Then
        assertEquals(new BigDecimal(95), theCost);
    }

    @Test
    public void shouldGestDescription() {
        //Given
        FlowerMail flowerMail = new BasicBouquet();
        flowerMail = new RoseOrder(flowerMail);
        flowerMail = new GrassOrder(flowerMail);
        //When
        String description = flowerMail.getDescription();
        //Then
        assertEquals("Order a bouquet of Roses with additional grass", description);
    }
}
