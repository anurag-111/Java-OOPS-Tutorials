package com.oopsDemo.tutorial07.genericsDemo.customExample.genArrayList;

public class Main {

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        for (int i = 0; i < 14; i++) {
            list.add(i +2);
        }

        System.out.println("Initially : ");
        for (int i = 0; i < list.size(); i++) {
            list.print(i);
        }

        System.out.println();
        list.remove();

        System.out.println("After removal : ");
        for (int i = 0; i < list.size(); i++) {
            list.print(i);
        }

        System.out.println();
        list.add(16);

        System.out.println("After insertion : ");
        System.out.println(list);

    }
}
