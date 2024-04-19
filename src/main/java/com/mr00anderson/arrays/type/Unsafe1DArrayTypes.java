package com.mr00anderson.arrays.type;

import java.lang.reflect.Array;

public class Unsafe1DArrayTypes<T> {
    private T[] array;

    public Unsafe1DArrayTypes(Class<T> clazz, int size) {
        // Create an array of type T with the specified size
        this.array = (T[]) Array.newInstance(clazz, size);
    }

    public void set(int index, T value) {
        // Direct assignment without boundary checks
        array[index] = value;
    }

    public T get(int index) {
        // Direct retrieval without boundary checks
        return array[index];
    }
}
