package com.oopsDemo.tutorial6.interfaceDemo.interfaceExample;

interface Vehicle {
    void changeGear(int gear);
    void incrementSpeed(int inc);
    void decrementSpeed(int dec);

    static void notification() {
        System.out.println("Process completed!");
    }
}
