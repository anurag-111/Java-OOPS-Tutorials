package com.oopsDemo.tutorial03.propertiesDemo.abstraction;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound();
        System.out.println("Name: " + dog.name);
    }
}
