package com.oopsDemo.tutorial10.exceptionHandlingDemo;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
/*
 -> The MyException class is defined, which extends the Exception class.

 -> This means that MyException is a custom exception class that inherits the
    properties and behaviors of the Exception class.

 -> The MyException class has a constructor that takes a String parameter called message.

 -> Inside the constructor, the super(message) statement is used to call the constructor
    of the parent Exception class. This is done to set the error message of the exception
    using the provided message parameter.

 -> By extending the Exception class and providing a custom constructor, the MyException
    class allows us to create instances of this exception with a custom error message when needed.
*/
