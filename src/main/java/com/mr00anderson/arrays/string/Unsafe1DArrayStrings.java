package com.mr00anderson.arrays.string;

public class Unsafe1DArrayStrings {
    private String[] array;

    public Unsafe1DArrayStrings(int size) {
        this.array = new String[size];
    }

    public void set(int index, String value) {
        // No bounds checking here, potentially unsafe
        array[index] = value;
    }

    public String get(int index) {
        // No bounds checking here, potentially unsafe
        return array[index];
    }
}
