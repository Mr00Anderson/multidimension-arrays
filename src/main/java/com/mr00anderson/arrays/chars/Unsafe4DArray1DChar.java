package com.mr00anderson.arrays.chars;

public class Unsafe4DArray1DChar {
    private char[] array;
    private int time;
    private int depth;
    private int rows;
    private int cols;

    public Unsafe4DArray1DChar(int time, int depth, int rows, int cols) {
        this.time = time;
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.array = new char[time * depth * rows * cols];
    }

    public void set(int t, int z, int x, int y, char value) {
        // No bounds checking here, potentially unsafe
        array[t * depth * rows * cols + z * rows * cols + x * cols + y] = value;
    }

    public char get(int t, int z, int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[t * depth * rows * cols + z * rows * cols + x * cols + y];
    }
}
