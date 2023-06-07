package com.oopsDemo.tutorial5.abstratDemo;

public abstract class Parent {
    String name;
    static int age;

    public Parent(String name, int age) {
        this.name = name;
        Parent.age = age;
    }

    static void age() {
        System.out.println("Age : " + age);
    }
    abstract void property();
    abstract void genetics();
}
