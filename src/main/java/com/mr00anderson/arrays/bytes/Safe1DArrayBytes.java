package com.mr00anderson.arrays.bytes;

public class Safe1DArrayBytes {
    private byte[] array;

    public Safe1DArrayBytes(int size) {
        this.array = new byte[size];
    }

    public void set(int index, byte value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + array.length);
        }
    }

    public byte get(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + array.length);
        }
    }
}
