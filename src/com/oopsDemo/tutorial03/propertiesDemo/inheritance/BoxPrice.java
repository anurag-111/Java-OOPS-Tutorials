package com.oopsDemo.tutorial03.propertiesDemo.inheritance;

public class BoxPrice extends BoxWeight{
    int price;

    public BoxPrice(int l, int b, int h, int weight, int price) {
        super(l, b, h, weight);
        this.price = price;
    }

    @Override
    public String toString() {
        return "BoxPrice {" +
                "price = " + price +
                ", weight = " + weight +
                ", l = " + l +
                ", b = " + b +
                ", h = " + h +
                '}';
    }
}
