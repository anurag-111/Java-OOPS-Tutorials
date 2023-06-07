package com.oopsDemo.tutorial9.funcInterfacesDemo.lambdaFunctionsDemo;

/**
 * Functional interface representing an operation that takes two integers
 * and returns an integer result.
 */
@FunctionalInterface
public interface Operation {
    int operation(int a, int b);
}