package com.oopsDemo.tutorial8.comparingDemo;

public class Student implements Comparable<Student>{
    int rollNumber;
    float marks;

    public Student(int rollNumber, float marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student { " +
                "rollNumber = " + rollNumber +
                ", marks = " + marks +
                " }";
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.marks - o.marks);
    }
    // Returns a negative integer, zero, or a positive integer as this object is less than,
    // equal to, or greater than the specified object.

}
