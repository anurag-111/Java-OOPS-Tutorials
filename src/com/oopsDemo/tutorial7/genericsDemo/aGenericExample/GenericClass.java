package com.oopsDemo.tutorial7.genericsDemo.aGenericExample;

public class GenericClass <T, U>{
    T obj1; // Declaring a generic type variable T
    U obj2; // Declaring a generic type variable U

    public GenericClass(T obj1, U obj2) { // Constructor taking parameters of type T and U
        this.obj1 = obj1; // Assigning the value of obj1 parameter to the obj1 variable
        this.obj2 = obj2; // Assigning the value of obj2 parameter to the obj2 variable
    }

    @Override
    public String toString() {
        return "GenericClass { " +
                "obj1 = " + obj1 + // Including the value of obj1 in the string representation
                ", obj2 = " + obj2 + // Including the value of obj2 in the string representation
                " }";
    }
}
