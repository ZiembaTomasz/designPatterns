package com.ziembatomasz.patterns.strategy;

import org.junit.Assert;
import org.junit.Test;

public class BookmakerTestSuite {
    @Test
    public void testBettingStrategy(){
        //Given
        Bookmaker max = new RiskingBookmaker("Max");
        Bookmaker george = new CarefulBookmaker("George");
        Bookmaker jason = new RegularBookmaker("Jason");
        //When
        String maxShouldBet = max.predict();
        String georgerShouldBet = george.predict();
        String jasonShouldBet = jason.predict();
        //Then
        Assert.assertEquals("Bet a match for 1000 dollars", maxShouldBet);
        Assert.assertEquals("Bet a match for 100 dollars", jasonShouldBet);
        Assert.assertEquals("Bet a match for 10 dollars", georgerShouldBet);
    }
}
