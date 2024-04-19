package com.mr00anderson.arrays.ints;

public class Unsafe1DArrayInts {
    private int[] array;

    public Unsafe1DArrayInts(int size) {
        this.array = new int[size];
    }

    public void set(int index, int value) {
        // No bounds checking here, potentially unsafe
        array[index] = value;
    }

    public int get(int index) {
        // No bounds checking here, potentially unsafe
        return array[index];
    }
}
