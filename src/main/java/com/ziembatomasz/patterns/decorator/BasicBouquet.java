package com.ziembatomasz.patterns.decorator;

import java.math.BigDecimal;

public class BasicBouquet implements FlowerMail {
    public BigDecimal getCostOfBouquet() {
        return new BigDecimal(25.00);
    }

    public String getDescription() {
        return "Order a bouquet";
    }
}
