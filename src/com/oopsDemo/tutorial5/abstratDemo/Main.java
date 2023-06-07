package com.oopsDemo.tutorial5.abstratDemo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Child child1 = new Child("Max", 31);
        Child child2 = new Child("Jax", 39);
        for (Child child : Arrays.asList(child1, child2)) {
            Parent.age();
            child.genetics();
            child.property();
        }
    }
}
