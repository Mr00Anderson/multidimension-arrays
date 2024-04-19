package com.mr00anderson.arrays.type;

import java.lang.reflect.Array;

public class Safe5DArray1DTypes<T> {
    private T[] array;
    private int rows;
    private int cols;
    private int depth;
    private int time;
    private int space;  // Renamed from 'phase' to 'space'

    public Safe5DArray1DTypes(Class<T> clazz, int rows, int cols, int depth, int time, int space) {
        this.rows = rows;
        this.cols = cols;
        this.depth = depth;
        this.time = time;
        this.space = space;
        // Create an array of type T with the total size calculated by rows * cols * depth * time * space
        this.array = (T[]) Array.newInstance(clazz, rows * cols * depth * time * space);
    }

    public void set(int x, int y, int z, int t, int s, T value) {
        if (x >= 0 && x < rows && y >= 0 && y < cols && z >= 0 && z < depth &&
            t >= 0 && t < time && s >= 0 && s < space) {
            array[x * cols * depth * time * space + y * depth * time * space + z * time * space + t * space + s] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public T get(int x, int y, int z, int t, int s) {
        if (x >= 0 && x < rows && y >= 0 && y < cols && z >= 0 && z < depth &&
            t >= 0 && t < time && s >= 0 && s < space) {
            return array[x * cols * depth * time * space + y * depth * time * space + z * time * space + t * space + s];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
