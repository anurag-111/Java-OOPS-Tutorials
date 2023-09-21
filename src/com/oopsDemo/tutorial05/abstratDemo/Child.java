package com.oopsDemo.tutorial05.abstratDemo;

public class Child extends Parent {

    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    void property() {
        System.out.println(name + "'s Property Accepted.");
    }


    @Override
    void genetics() {
        System.out.println(name + "'s Genetics Accepted.");
    }


}
