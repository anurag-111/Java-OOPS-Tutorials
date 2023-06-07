package com.oopsDemo.tutorial3.propertiesDemo.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        shape.area();

        //Overrides: area in class Shapes
        circle.area();

        //Overrides: area in class Shapes
        triangle.area();


        int base = 6;
        int height = 6;

        // Overloaded area() method
        triangle.area(base, height);
    }
}

/*  Rules of Overriding:

    1. Arguments must be the same, and return types must be compatible.

    2. The method can’t be less accessible.
        -> That means the accessDemo level must be the same, or friendlier.
           That means you can’t, for example, override a public method
           and make it private.
 */

/* Rules of Overloading :

   1. The return types can be different.
        -> You’re free to change the return types in
           overloaded methods, as long as the argument lists
           are different.

   2. You can’t change ONLY the return type.
        -> If only the return type is different, it’s not a
           valid overload—the compiler will assume
           you’re trying to override the method. And even
           that won’t be legal unless the return type is
           a subtype of the return type declared in the
           superclass. To overload a method, you MUST
           change the argument list, although you can
           change the return type to anything.

    3. You can vary the accessDemo levels in any direction.
       ->  You’re free to overload a method with a method
           that’s more restrictive. It does not matter, since the
           new method isn’t obligated to fulfill the contract of
           the overloaded method.
*/