package com.mr00anderson.arrays.type;

import java.lang.reflect.Array;

public class Safe6DArray1DTypes<T> {
    private T[] array;
    private int rows;
    private int cols;
    private int depth;
    private int time;
    private int space;
    private int era;  // The new sixth dimension

    public Safe6DArray1DTypes(Class<T> clazz, int rows, int cols, int depth, int time, int space, int era) {
        this.rows = rows;
        this.cols = cols;
        this.depth = depth;
        this.time = time;
        this.space = space;
        this.era = era;
        // Create an array of type T with the total size calculated by rows * cols * depth * time * space * era
        this.array = (T[]) Array.newInstance(clazz, rows * cols * depth * time * space * era);
    }

    public void set(int x, int y, int z, int t, int s, int e, T value) {
        if (x >= 0 && x < rows && y >= 0 && y < cols && z >= 0 && z < depth &&
            t >= 0 && t < time && s >= 0 && s < space && e >= 0 && e < era) {
            array[x * cols * depth * time * space * era + y * depth * time * space * era + z * time * space * era + t * space * era + s * era + e] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public T get(int x, int y, int z, int t, int s, int e) {
        if (x >= 0 && x < rows && y >= 0 && y < cols && z >= 0 && z < depth &&
            t >= 0 && t < time && s >= 0 && s < space && e >= 0 && e < era) {
            return array[x * cols * depth * time * space * era + y * depth * time * space * era + z * time * space * era + t * space * era + s * era + e];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
