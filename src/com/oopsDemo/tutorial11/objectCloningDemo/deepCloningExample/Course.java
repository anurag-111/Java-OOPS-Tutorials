package com.oopsDemo.tutorial11.objectCloningDemo.deepCloningExample;

public class Course implements Cloneable{
    String name;

    public Course(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public Course clone() throws CloneNotSupportedException {
        return (Course) super.clone();
    }
}
