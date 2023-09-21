package com.oopsDemo.tutorial03.propertiesDemo.inheritance;

public class Box {
    int l;
    int b;
    int h;

    public Box() {
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    public Box(int l) {
        this.l = l;
    }

    public Box(Box old) {
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }

    public Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
}
