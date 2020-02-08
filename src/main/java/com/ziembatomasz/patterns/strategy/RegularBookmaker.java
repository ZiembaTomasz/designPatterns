package com.ziembatomasz.patterns.strategy;

public class RegularBookmaker extends Bookmaker {
    public RegularBookmaker(String name){
        super(name);
        this.betPredictor = new RegularPredictor();
    }
}
