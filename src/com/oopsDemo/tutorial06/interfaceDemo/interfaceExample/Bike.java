package com.oopsDemo.tutorial06.interfaceDemo.interfaceExample;

public class Bike implements Vehicle {
    int gear;
    int speed;

    public Bike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void incrementSpeed(int newInc) {
        speed += newInc;
    }

    @Override
    public void decrementSpeed(int newDec) {
        speed -= newDec;
    }

    @Override
    public String toString() {
        return "Bike : " +
                "gear = " + gear +
                ", speed = " + speed;
    }
}
