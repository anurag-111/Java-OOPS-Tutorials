package com.oopsDemo.tutorial08.comparingDemo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = {
                new Student(101, 85.5f),
                new Student(102, 90.0f),
                new Student(103, 78.2f),
                new Student(104, 95.7f),
                new Student(105, 88.9f)
        };

        System.out.println("Initial array : ");
        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(students));
    }
}
