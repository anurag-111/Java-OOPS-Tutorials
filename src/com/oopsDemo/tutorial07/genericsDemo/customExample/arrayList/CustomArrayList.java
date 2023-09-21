package com.oopsDemo.tutorial07.genericsDemo.customExample.arrayList;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // Copy the current items into the new arrayList
        int i = 0;
        while (i < data.length) {
            temp[i] = data[i];
            i++;
        }
        data = temp;
    }

    public void print(int index) { System.out.print(data[index] + " "); }

    private boolean isFull() {
        return size == data.length;
    }


    // Removes the last element from the ArrayList.
    public void remove() { --size; }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "CustomArrayList {" +
                "data = " + Arrays.toString(data) +
                ", size = " + size +
                '}';
    }
}
