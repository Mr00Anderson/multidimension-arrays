package com.mr00anderson.arrays.shorts;

public class Unsafe1DArrayShorts {
    private short[] array;

    public Unsafe1DArrayShorts(int size) {
        this.array = new short[size];
    }

    public void set(int index, short value) {
        // No bounds checking here, potentially unsafe
        array[index] = value;
    }

    public short get(int index) {
        // No bounds checking here, potentially unsafe
        return array[index];
    }
}
