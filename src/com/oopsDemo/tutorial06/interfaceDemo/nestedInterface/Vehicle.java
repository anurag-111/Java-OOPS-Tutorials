package com.oopsDemo.tutorial06.interfaceDemo.nestedInterface;

public interface Vehicle {
    void start();
    void stop();

    interface Engine{
        void ignite();
        void shutdown();
    }
}

/*
 Purpose: This file defines the Vehicle interface, which declares two abstract methods:
 start() and stop(). It also defines an inner interface called Engine, which declares
 two additional abstract methods: ignite() and shutdown().
*/