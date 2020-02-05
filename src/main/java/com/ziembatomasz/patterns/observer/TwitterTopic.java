package com.ziembatomasz.patterns.observer;


import java.util.ArrayList;
import java.util.List;

public class TwitterTopic implements Observable {
    private final List<String> twitts;
    private final String name;
    private final List<Observer> observers;

    public TwitterTopic(String name) {
        observers = new ArrayList<>();
        twitts = new ArrayList<>();
        this.name = name;
    }

    public void addTwitt(String twitt) {
        twitts.add(twitt);
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTwitts() {
        return twitts;
    }

    public String getName() {
        return name;
    }
}
