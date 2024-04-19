package com.mr00anderson.arrays.type;

import java.lang.reflect.Array;

public class Unsafe4DArray1DTypes<T> {
    private T[] array;
    private int rows;
    private int cols;
    private int depth;
    private int time;  // Fourth dimension typically represents time or another layer

    public Unsafe4DArray1DTypes(Class<T> clazz, int rows, int cols, int depth, int time) {
        this.rows = rows;
        this.cols = cols;
        this.depth = depth;
        this.time = time;
        // Calculate the size of the array as rows * cols * depth * time
        this.array = (T[]) Array.newInstance(clazz, rows * cols * depth * time);
    }

    public void set(int x, int y, int z, int t, T value) {
        // Direct assignment without boundary checks
        array[x * cols * depth * time + y * depth * time + z * time + t] = value;
    }

    public T get(int x, int y, int z, int t) {
        // Direct retrieval without boundary checks
        return array[x * cols * depth * time + y * depth * time + z * time + t];
    }
}
