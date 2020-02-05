package com.ziembatomasz.patterns.singleton;

public class SingletonFile {
    private static SingletonFile singletonFileInstance = null;
    private String fileName = "";

    private SingletonFile() {

    }

    public static SingletonFile getInstance() {
        if (singletonFileInstance == null) {
            synchronized (SingletonFile.class) {
                if (singletonFileInstance == null) {
                    singletonFileInstance = new SingletonFile();
                }
            }
        }
        return singletonFileInstance;
    }

    public void open(String file) {
        fileName = file;
        System.out.println("File " + file + " was open.");
    }

    public String getFileName() {
        return fileName;
    }
}
