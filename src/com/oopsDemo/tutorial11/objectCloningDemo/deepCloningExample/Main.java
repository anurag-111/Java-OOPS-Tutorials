package com.oopsDemo.tutorial11.objectCloningDemo.deepCloningExample;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course = new Course("Java Programming");
        Student originalStudent = new Student("John", course);

        Student clonedStudent = (Student) originalStudent.clone();

        System.out.println("Original Student: " + originalStudent.getName() + ", Course: " + originalStudent.getCourse().getName());
        System.out.println("Cloned Student: " + clonedStudent.getName() + ", Course: " + clonedStudent.getCourse().getName());

        // Modifying the course for the cloned student
        clonedStudent.getCourse().setName("Python Programming");

        System.out.println("Modified Course for Cloned Student: " + clonedStudent.getCourse().getName());
        System.out.println("Course for Original Student: " + originalStudent.getCourse().getName());
    }
}
