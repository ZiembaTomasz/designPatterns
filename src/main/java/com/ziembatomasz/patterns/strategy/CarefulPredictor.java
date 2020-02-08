package com.ziembatomasz.patterns.strategy;

public class CarefulPredictor implements BetPredictor {
    @Override
    public String predictWhatToBet(){
        return "Bet a match for 10 dollars";
    }
}
