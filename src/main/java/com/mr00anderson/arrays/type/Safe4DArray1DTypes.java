package com.mr00anderson.arrays.type;

import java.lang.reflect.Array;

public class Safe4DArray1DTypes<T> {
    private T[] array;
    private int rows;
    private int cols;
    private int depth;
    private int time;

    public Safe4DArray1DTypes(Class<T> clazz, int rows, int cols, int depth, int time) {
        this.rows = rows;
        this.cols = cols;
        this.depth = depth;
        this.time = time;
        // Create an array of type T with the total size calculated by rows * cols * depth * time
        this.array = (T[]) Array.newInstance(clazz, rows * cols * depth * time);
    }

    public void set(int x, int y, int z, int t, T value) {
        if (x >= 0 && x < rows && y >= 0 && y < cols && z >= 0 && z < depth && t >= 0 && t < time) {
            array[x * cols * depth * time + y * depth * time + z * time + t] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public T get(int x, int y, int z, int t) {
        if (x >= 0 && x < rows && y >= 0 && y < cols && z >= 0 && z < depth && t >= 0 && t < time) {
            return array[x * cols * depth * time + y * depth * time + z * time + t];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
