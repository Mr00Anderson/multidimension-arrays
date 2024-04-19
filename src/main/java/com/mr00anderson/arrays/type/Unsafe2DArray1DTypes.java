package com.mr00anderson.arrays.type;

import java.lang.reflect.Array;

public class Unsafe2DArray1DTypes<T> {
    private T[] array;
    private int rows; // Used for calculating the number of columns when indexing
    private int cols;

    public Unsafe2DArray1DTypes(Class<T> clazz, int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        // Create an array of type T with the size equivalent to rows * cols
        this.array = (T[]) Array.newInstance(clazz, rows * cols);
    }

    public void set(int x, int y, T value) {
        // Assumes x and y are always within bounds
        array[x * cols + y] = value;
    }

    public T get(int x, int y) {
        // Assumes x and y are always within bounds
        return array[x * cols + y];
    }
}
