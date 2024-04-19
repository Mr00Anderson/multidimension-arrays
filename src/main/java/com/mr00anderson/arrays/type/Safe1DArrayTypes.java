package com.mr00anderson.arrays.type;

import java.lang.reflect.Array;

public class Safe1DArrayTypes<T> {
    private T[] array;

    public Safe1DArrayTypes(Class<T> clazz, int size) {
        // Correctly instantiate an array of type T
        this.array = (T[]) Array.newInstance(clazz, size);
    }

    public void set(int index, T value) {
        if (index >= 0 && index < array.length) {
            array[index] = value;
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + array.length);
        }
    }

    public T get(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + array.length);
        }
    }
}
