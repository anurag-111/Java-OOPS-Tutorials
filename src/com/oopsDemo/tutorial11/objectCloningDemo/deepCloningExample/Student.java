package com.oopsDemo.tutorial11.objectCloningDemo.deepCloningExample;

public class Student implements Cloneable{
    String name;
    Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student { " +
                "name = '" + name + '\'' +
                ", course = " + course +
                " }";
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        // Perform a shallow cloning of the Student object using super.clone()
        Student clonedStudent = (Student) super.clone();

        // Perform deep cloning of the Course object
        clonedStudent.course = course.clone();

        // Return the cloned Student object
        return clonedStudent;
    }

}

