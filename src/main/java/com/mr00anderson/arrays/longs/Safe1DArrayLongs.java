package com.mr00anderson.arrays.longs;

public class Safe1DArrayLongs {
    private long[] array;

    public Safe1DArrayLongs(int size) {
        this.array = new long[size];
    }

    public void set(int index, long value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + array.length);
        }
    }

    public long get(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + array.length);
        }
    }
}
