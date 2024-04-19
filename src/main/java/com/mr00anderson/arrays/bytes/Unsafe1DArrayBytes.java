package com.mr00anderson.arrays.bytes;

public class Unsafe1DArrayBytes {
    private byte[] array;

    public Unsafe1DArrayBytes(int size) {
        this.array = new byte[size];
    }

    public void set(int index, byte value) {
        // No bounds checking here, potentially unsafe
        array[index] = value;
    }

    public byte get(int index) {
        // No bounds checking here, potentially unsafe
        return array[index];
    }
}
