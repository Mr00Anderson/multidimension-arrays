package com.mr00anderson.arrays.string;

public class Safe1DArrayString {
    private String[] array;

    public Safe1DArrayString(int size) {
        this.array = new String[size];
    }

    public void set(int index, String value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + array.length);
        }
    }

    public String get(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + array.length);
        }
    }
}
