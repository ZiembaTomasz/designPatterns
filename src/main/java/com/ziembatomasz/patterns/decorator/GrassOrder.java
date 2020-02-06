package com.ziembatomasz.patterns.decorator;

import java.math.BigDecimal;

public class GrassOrder extends AbstractBasicBouquetDecorator {
    public GrassOrder(FlowerMail flowerMail) {
        super(flowerMail);
    }

    @Override
    public BigDecimal getCostOfBouquet() {
        return super.getCostOfBouquet().add(new BigDecimal(20));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with additional grass";
    }
}

