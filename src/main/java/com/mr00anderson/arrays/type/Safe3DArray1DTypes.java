package com.mr00anderson.arrays.type;

import java.lang.reflect.Array;

public class Safe3DArray1DTypes<T> {
    private T[] array;
    private int rows;
    private int cols;
    private int depth;

    public Safe3DArray1DTypes(Class<T> clazz, int rows, int cols, int depth) {
        this.rows = rows;
        this.cols = cols;
        this.depth = depth;
        // Create an array of type T with the total size of rows * cols * depth
        this.array = (T[]) Array.newInstance(clazz, rows * cols * depth);
    }

    public void set(int x, int y, int z, T value) {
        if (x >= 0 && x < rows && y >= 0 && y < cols && z >= 0 && z < depth) {
            array[x * cols * depth + y * depth + z] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public T get(int x, int y, int z) {
        if (x >= 0 && x < rows && y >= 0 && y < cols && z >= 0 && z < depth) {
            return array[x * cols * depth + y * depth + z];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
