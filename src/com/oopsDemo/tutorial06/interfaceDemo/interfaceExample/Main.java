package com.oopsDemo.tutorial06.interfaceDemo.interfaceExample;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike(1, 5);
        bike.changeGear(3);
        bike.incrementSpeed(15);
        bike.decrementSpeed(10);

        Car car = new Car(2, 10);
        car.changeGear(4);
        car.incrementSpeed(15);
        car.decrementSpeed(10);

        System.out.println(bike.toString());
        System.out.println(car.toString());

        Vehicle.notification();
    }
}
