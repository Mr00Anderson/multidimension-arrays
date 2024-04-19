package com.mr00anderson.arrays.string;

public class Safe4DArray1DStrings {
    private String[] array;
    private int time;
    private int depth;
    private int rows;
    private int cols;

    public Safe4DArray1DStrings(int time, int depth, int rows, int cols) {
        this.time = time;
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.array = new String[time * depth * rows * cols];
    }

    public void set(int t, int z, int x, int y, String value) {
        if (t >= 0 && t < time && z >= 0 && z < depth && x >= 0 && x < rows && y >= 0 && y < cols) {
            array[t * depth * rows * cols + z * rows * cols + x * cols + y] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public String get(int t, int z, int x, int y) {
        if (t >= 0 && t < time && z >= 0 && z < depth && x >= 0 && x < rows && y >= 0 && y < cols) {
            return array[t * depth * rows * cols + z * rows * cols + x * cols + y];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
