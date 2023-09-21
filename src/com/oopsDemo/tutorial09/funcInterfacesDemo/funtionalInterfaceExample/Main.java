package com.oopsDemo.tutorial09.funcInterfacesDemo.funtionalInterfaceExample;

public class Main {
    public static void main(String[] args) {
        int side = 10;
        Square square = (int x) -> x * x;
        int answer = square.calculate(side);
        System.out.println(answer);
    }
}
