package com.ziembatomasz.patterns.strategy;

public class Bookmaker {
    final private String name;
    BetPredictor betPredictor;

    public Bookmaker(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String predict(){
        return betPredictor.predictWhatToBet();
    }
    public void setBettingStrategy(BetPredictor bettingStrategy){
        this.betPredictor = betPredictor;
    }
}
