package com.mr00anderson.arrays.shorts;

public class Safe1DArrayShorts {
    private short[] array;

    public Safe1DArrayShorts(int size) {
        this.array = new short[size];
    }

    public void set(int index, short value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + array.length);
        }
    }

    public short get(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + array.length);
        }
    }
}
