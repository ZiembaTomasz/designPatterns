package com.ziembatomasz.patterns.decorator;

import java.math.BigDecimal;

public class TulipOrder extends AbstractBasicBouquetDecorator {
    public TulipOrder(FlowerMail flowerMail) {
        super(flowerMail);
    }

    @Override
    public BigDecimal getCostOfBouquet() {
        return super.getCostOfBouquet().add(new BigDecimal(50));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " of Tulips";
    }
}
