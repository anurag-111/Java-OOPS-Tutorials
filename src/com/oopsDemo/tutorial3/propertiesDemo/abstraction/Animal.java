package com.oopsDemo.tutorial3.propertiesDemo.abstraction;

// Animal class is an abstract class that defines the makeSound method without providing an implementation.
// The Dog class extends Animal and provides a specific implementation of the makeSound method.
// Abstraction allows defining common behavior in the abstract class while leaving the implementation
// details to the subclasses.

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}


