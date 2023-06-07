package com.oopsDemo.tutorial1.staticDemo;

public class Main {
    InnerClasses.Test sem1 = new InnerClasses.Test("Semester 1");
    InnerClasses.Test sem2 = new InnerClasses.Test("Semester 2");

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.sem1);
        System.out.println(main.sem2);
    }
}
