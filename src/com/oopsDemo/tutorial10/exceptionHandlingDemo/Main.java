package com.oopsDemo.tutorial10.exceptionHandlingDemo;

public class Main {
    public static void main(String[] args) {
        int dividend = 5;
        int divisor = 0;
        try {
            divide(dividend, divisor);  // Invoking the divide() method
            throw new MyException("It's an exception!");  // Throwing a custom exception called MyException
        } catch (MyException | ArithmeticException e) {  // Catching either MyException or ArithmeticException
            System.out.println(e.getMessage());
        } catch (Exception e) {  // Catching any other Exception
            System.out.println("Normal exception occurred");
        } finally {
            System.out.println("Finally.");  // Executed regardless of whether an exception occurred or not
        }
    }

    static void divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Do not divide by zero");  // Throwing an ArithmeticException when
        }                                                            // divisor is zero
        System.out.println(dividend / divisor);
    }
}
