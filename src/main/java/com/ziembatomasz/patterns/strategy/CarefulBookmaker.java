package com.ziembatomasz.patterns.strategy;

public class CarefulBookmaker extends Bookmaker {
    public CarefulBookmaker(String name){
        super(name);
        this.betPredictor = new CarefulPredictor();
    }
}
