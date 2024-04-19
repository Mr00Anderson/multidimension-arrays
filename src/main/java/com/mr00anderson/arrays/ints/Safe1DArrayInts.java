package com.mr00anderson.arrays.ints;

public class Safe1DArrayInts {
    private int[] array;

    public Safe1DArrayInts(int size) {
        this.array = new int[size];
    }

    public void set(int index, int value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + array.length);
        }
    }

    public int get(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + array.length);
        }
    }
}
