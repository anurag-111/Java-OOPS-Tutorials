package com.oopsDemo.tutorial11.objectCloningDemo.aObjetCloningExample;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Adam");
        Person person2 = person1.clone();
        person2.setName("Eve");

        System.out.println(person1);
        System.out.println(person2);
    }
}
