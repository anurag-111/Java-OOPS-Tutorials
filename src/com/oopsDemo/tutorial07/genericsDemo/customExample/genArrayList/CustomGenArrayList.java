package com.oopsDemo.tutorial07.genericsDemo.customExample.genArrayList;

import java.util.Arrays;

// Implementation of a custom generic ArrayList.
public class CustomGenArrayList<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomGenArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    // Adds an element to the ArrayList.
    public void add(T element) {
        if (isFull()) {
            resize();
        }
        data[size++] = element;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // Copy the current items into the new arrayList
        int i = 0;
        while (i < data.length) {
            temp[i] = data[i];
            i++;
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    // Removes the last element from the ArrayList.
    public void remove() {
        --size;
    }

    // Returns the element at the specified index.
    public void print(int index) {
        System.out.print(data[index] + " ");
    }

    /**
     * Returns the number of elements in the ArrayList.
     * @return the number of elements
     */
    public int size() {
        return size;
    }

    /**
     * Sets the element at the specified index to the given value.
     *
     * @param index the index of the element to set
     * @param value the new value to set
     */
    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList { " +
                "data = " + Arrays.toString(data) +
                ", size = " + size +
                '}';
    }
}