package com.mr00anderson.arrays.type;

import java.lang.reflect.Array;

public class Unsafe6DArray1DTypes<T> {
    private T[] array;
    private int rows;
    private int cols;
    private int depth;
    private int time;
    private int space;
    private int era;  // Sixth dimension

    public Unsafe6DArray1DTypes(Class<T> clazz, int rows, int cols, int depth, int time, int space, int era) {
        this.rows = rows;
        this.cols = cols;
        this.depth = depth;
        this.time = time;
        this.space = space;
        this.era = era;
        // Calculate the size of the array as rows * cols * depth * time * space * era
        this.array = (T[]) Array.newInstance(clazz, rows * cols * depth * time * space * era);
    }

    public void set(int x, int y, int z, int t, int s, int e, T value) {
        // Direct assignment without boundary checks
        array[x * cols * depth * time * space * era + y * depth * time * space * era + z * time * space * era + t * space * era + s * era + e] = value;
    }

    public T get(int x, int y, int z, int t, int s, int e) {
        // Direct retrieval without boundary checks
        return array[x * cols * depth * time * space * era + y * depth * time * space * era + z * time * space * era + t * space * era + s * era + e];
    }
}
