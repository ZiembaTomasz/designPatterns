package com.ziembatomasz.patterns.strategy;

public class RiskingBookmaker extends Bookmaker {
    public RiskingBookmaker(String name){
        super(name);
        this.betPredictor = new RiskingPredictor();
    }
}
