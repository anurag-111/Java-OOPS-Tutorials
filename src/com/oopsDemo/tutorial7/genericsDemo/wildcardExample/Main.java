package com.oopsDemo.tutorial7.genericsDemo.wildcardExample;

public class Main {
    public static void main(String[] args) {
        WildcardExample<Integer> list = new WildcardExample<>();
        for (int i = 0; i < 14; i++) {
            list.add(i + 1);
        }

        System.out.println("Initially: ");
        for (int i = 0; i < list.size(); i++) {
            list.print(i);
        }

        System.out.println();
        list.remove();

        System.out.println("After removal: ");
        for (int i = 0; i < list.size(); i++) {
            list.print(i);
        }

        System.out.println();
        list.add(32);
        list.add(1234);

        System.out.println("After insertion: ");
        System.out.println(list);
    }
}

