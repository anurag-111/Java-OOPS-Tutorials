package com.oopsDemo.tutorial4.accessDemo;

import java.lang.reflect.*;

public class ObjectClass {
    public static void main(String[] args) {
        int methodCount = 0; // Counter to keep track of the number of methods
        Object obj = "Hello World!";

        // The <?> is a wildcard that allows the Class object to represent any type of class.
        // It is used when the specific type of the class is not known or not important.
        Class<?> objectClass = obj.getClass();

        System.out.println("Fully qualified name of the class: " + objectClass.getName());

        Method[] methods = objectClass.getDeclaredMethods(); // Get all declared methods of the class
        System.out.println("Methods information: ");

        for (Method method : methods) {
            methodCount++;
            System.out.println(method.getName());
        }

        System.out.println("Total number of methods present: " + methodCount);
    }
}
