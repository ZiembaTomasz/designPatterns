package com.ziembatomasz.patterns.observer;


public class TwitterUser implements Observer {
    private final String userName;
    private int updater;

    public TwitterUser(String userName) {
        this.userName = userName;
    }

    public void update(TwitterTopic twitterTopic) {
        System.out.println(userName + ": New news in  " + twitterTopic.getName() + "\n" +
                " (total: " + twitterTopic.getTwitts().size() + " news.)");
        updater++;
    }

    public String getUserName() {
        return userName;
    }

    public int getUpdater() {
        return updater;
    }
}
