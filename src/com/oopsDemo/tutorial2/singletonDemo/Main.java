package com.oopsDemo.tutorial2.singletonDemo;

public class Main {
    public static void main(String[] args) {
        // 'Singleton()' has private accessDemo in 'singletonExamples.Singleton'
        // Singleton obj1 = new Singleton();

        Singleton obj = Singleton.getInstance();
        System.out.println(obj);
        System.out.println(Singleton.getInstance());
    }
}