package com.oopsDemo.tutorial02.singletonDemo;

public final class Singleton {

    private Singleton() { }

    private static Singleton instance;

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
