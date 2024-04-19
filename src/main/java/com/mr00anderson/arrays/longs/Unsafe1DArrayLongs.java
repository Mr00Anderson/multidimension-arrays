package com.mr00anderson.arrays.longs;

public class Unsafe1DArrayLongs {
    private long[] array;

    public Unsafe1DArrayLongs(int size) {
        this.array = new long[size];
    }

    public void set(int index, long value) {
        // No bounds checking here, potentially unsafe
        array[index] = value;
    }

    public long get(int index) {
        // No bounds checking here, potentially unsafe
        return array[index];
    }
}
