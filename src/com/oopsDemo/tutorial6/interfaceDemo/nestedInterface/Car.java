package com.oopsDemo.tutorial6.interfaceDemo.nestedInterface;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    public static class CarEngine implements Engine{
        @Override
        public void ignite() {
            System.out.println("Car Engine ignited");
        }

        @Override
        public void shutdown() {
            System.out.println("Car engine shutdown");
        }
    }
}

/*
 Purpose: This file contains the Car class, which implements the Vehicle interface.
 It provides the implementation for the start() and stop() methods defined in the
 Vehicle interface. It also contains a nested static class called CarEngine, which
 implements the Engine interface and provides the implementation for the ignite()
 and shutdown() methods.
*/

