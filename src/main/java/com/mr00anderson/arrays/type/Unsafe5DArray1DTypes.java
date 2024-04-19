package com.mr00anderson.arrays.type;

import java.lang.reflect.Array;

public class Unsafe5DArray1DTypes<T> {
    private T[] array;
    private int rows;
    private int cols;
    private int depth;
    private int time;
    private int space;  // Fifth dimension, previously mentioned as sequence

    public Unsafe5DArray1DTypes(Class<T> clazz, int rows, int cols, int depth, int time, int space) {
        this.rows = rows;
        this.cols = cols;
        this.depth = depth;
        this.time = time;
        this.space = space;
        // Calculate the size of the array as rows * cols * depth * time * space
        this.array = (T[]) Array.newInstance(clazz, rows * cols * depth * time * space);
    }

    public void set(int x, int y, int z, int t, int s, T value) {
        // Direct assignment without boundary checks
        array[x * cols * depth * time * space + y * depth * time * space + z * time * space + t * space + s] = value;
    }

    public T get(int x, int y, int z, int t, int s) {
        // Direct retrieval without boundary checks
        return array[x * cols * depth * time * space + y * depth * time * space + z * time * space + t * space + s];
    }
}
