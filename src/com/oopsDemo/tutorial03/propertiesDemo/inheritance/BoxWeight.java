package com.oopsDemo.tutorial03.propertiesDemo.inheritance;

public class BoxWeight extends Box{
    int weight;

    public BoxWeight(int l, int b, int h, int weight) {
//        By calling super(l, b, h), the constructor of the superclass is invoked with
//        the provided arguments l, b, and h. This means that the superclass constructor
//        is responsible for initializing the inherited members (fields or variables) with
//        the provided values.
        super(l, b, h);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "InnerBox{" +
                "weight=" + weight +
                ", l=" + l +
                ", b=" + b +
                ", h=" + h +
                '}';
    }
}
