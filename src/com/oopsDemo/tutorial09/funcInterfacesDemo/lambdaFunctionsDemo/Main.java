package com.oopsDemo.tutorial09.funcInterfacesDemo.lambdaFunctionsDemo;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            arr.add(i + 1);
//        }

        // Example 1: Using lambda function with forEach
//        Consumer<Integer> printDouble = item -> System.out.println(item * 2);
//        arr.forEach(printDouble);

        // Example 2: Using lambda function with custom functional interface

        //noinspection Convert2MethodRef
        Operation sum = (a, b) -> a + b;

        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(5, 3, sum));
        System.out.println(myCalculator.operate(6, 4, prod));
        System.out.println(myCalculator.operate(7, 5, sub));
    }
}
