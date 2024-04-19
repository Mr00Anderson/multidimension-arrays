package com.mr00anderson.arrays.chars;

public class Unsafe1DArrayChar {
    private char[] array;

    public Unsafe1DArrayChar(int size) {
        this.array = new char[size];
    }

    public void set(int index, char value) {
        // No bounds checking here, potentially unsafe
        array[index] = value;
    }

    public char get(int index) {
        // No bounds checking here, potentially unsafe
        return array[index];
    }
}
