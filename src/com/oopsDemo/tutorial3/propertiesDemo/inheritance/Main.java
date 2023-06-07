package com.oopsDemo.tutorial3.propertiesDemo.inheritance;

public class Main {
    public static void main(String[] args) {

        Box box = new Box();
        System.out.println(box.l + " " + box.b + " " + box.h);

        Box box1 = new Box(5);
        System.out.println(box1.l + " " + box1.b + " " + box1.h);

        Box box2 = new Box(110, 20, 130);
        System.out.println(box2.l + " " + box2.b + " " + box2.h);

        Box box3 = new Box(box2);
        System.out.println(box3.l + " " + box3.b + " " + box3.h);

        BoxWeight box4 = new BoxWeight(12, 13, 14, 15);
        System.out.println(box4);

        // The reference variable belongs to the parent class whereas
        // the object type belongs to the child class.
        Box box5 = new BoxWeight(13, 14, 15, 26);
        System.out.println(box5);

        // Multilevel Inheritance
        // Box -> BoxWeight -> BoxPrice
        BoxPrice box6 = new BoxPrice(120, 130, 140, 150, 160);
        System.out.println(box6);



    }
}
