package com.mr00anderson.arrays.type;

import java.lang.reflect.Array;

public class Safe2DArray1DTypes<T> {
    private T[] array;
    private int rows;
    private int cols;

    public Safe2DArray1DTypes(Class<T> clazz, int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        // Create an array of type T with the total size of rows * cols
        this.array = (T[]) Array.newInstance(clazz, rows * cols);
    }

    public void set(int x, int y, T value) {
        if (x >= 0 && x < rows && y >= 0 && y < cols) {
            array[x * cols + y] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public T get(int x, int y) {
        if (x >= 0 && x < rows && y >= 0 && y < cols) {
            return array[x * cols + y];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
