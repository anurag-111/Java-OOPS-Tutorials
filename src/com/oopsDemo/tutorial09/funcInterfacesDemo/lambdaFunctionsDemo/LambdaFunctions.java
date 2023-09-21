package com.oopsDemo.tutorial09.funcInterfacesDemo.lambdaFunctionsDemo;

/**
 * Example class demonstrating the usage of lambda functions in Java.
 */
public class LambdaFunctions {
    /**
     * Performs the specified operation on the given operands.
     *
     * @param a  the first operand
     * @param b  the second operand
     * @param op the operation to be performed
     * @return the result of the operation
     */
    public int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}
