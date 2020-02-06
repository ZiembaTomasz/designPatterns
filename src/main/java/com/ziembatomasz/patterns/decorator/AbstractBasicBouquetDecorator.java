package com.ziembatomasz.patterns.decorator;

import java.math.BigDecimal;

public class AbstractBasicBouquetDecorator implements FlowerMail {
    private FlowerMail flowerMail;

    protected AbstractBasicBouquetDecorator(FlowerMail flowerMail) {
        this.flowerMail = flowerMail;
    }

    public BigDecimal getCostOfBouquet() {
        return flowerMail.getCostOfBouquet();
    }

    public String getDescription() {
        return flowerMail.getDescription();
    }
}
