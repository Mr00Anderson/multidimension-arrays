package com.mr00anderson.arrays.type;

import java.lang.reflect.Array;

public class Unsafe3DArray1DTypes<T> {
    private T[] array;
    private int rows;
    private int cols;
    private int depth;  // Additional third dimension

    public Unsafe3DArray1DTypes(Class<T> clazz, int rows, int cols, int depth) {
        this.rows = rows;
        this.cols = cols;
        this.depth = depth;
        // Calculate the size of the array as rows * cols * depth
        this.array = (T[]) Array.newInstance(clazz, rows * cols * depth);
    }

    public void set(int x, int y, int z, T value) {
        // Direct assignment without boundary checks
        array[x * cols * depth + y * depth + z] = value;
    }

    public T get(int x, int y, int z) {
        // Direct retrieval without boundary checks
        return array[x * cols * depth + y * depth + z];
    }
}
