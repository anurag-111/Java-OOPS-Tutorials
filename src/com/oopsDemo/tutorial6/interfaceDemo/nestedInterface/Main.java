package com.oopsDemo.tutorial6.interfaceDemo.nestedInterface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();

        Car.CarEngine carEngine = new Car.CarEngine();
        carEngine.ignite();

        car.stop();
        carEngine.shutdown();
    }
}

/*
 Purpose: This file contains the MainClass class with the main() method,
 which serves as the entry point of the program. It creates instances of
 the Car class and the nested CarEngine class, and invokes their respective methods.
*/


