package com.ziembatomasz.patterns.decorator;

import java.math.BigDecimal;

public class RoseOrder extends AbstractBasicBouquetDecorator {
    public RoseOrder(FlowerMail flowerMail) {
        super(flowerMail);
    }

    @Override
    public BigDecimal getCostOfBouquet() {
        return super.getCostOfBouquet().add(new BigDecimal(100));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " of Roses";
    }
}

