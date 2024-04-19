package com.mr00anderson.arrays.chars;

public class Safe1DArrayChar {
    private char[] array;

    public Safe1DArrayChar(int size) {
        this.array = new char[size];
    }

    public void set(int index, char value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + array.length);
        }
    }

    public char get(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + array.length);
        }
    }
}
