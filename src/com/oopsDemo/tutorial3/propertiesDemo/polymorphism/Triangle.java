package com.oopsDemo.tutorial3.propertiesDemo.polymorphism;

public class Triangle extends Shapes{
//    @Override : Indicates that a method declaration is intended to override a method declaration in a supertype.
//    If a method is annotated with this annotation type compilers are required to generate an error
//    message unless following condition is held:
//    The method does override or implement a method declared in a supertype.
    @Override
    void area() {
        System.out.println("Area of a triangle.");
    }

    // Overloading of area()
    void area(int b, int h) {
        System.out.println("Area of triangle : " + 0.5 * b * h);
    }
}
