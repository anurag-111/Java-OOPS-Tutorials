package com.oopsDemo.tutorial3.propertiesDemo.abstraction;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
