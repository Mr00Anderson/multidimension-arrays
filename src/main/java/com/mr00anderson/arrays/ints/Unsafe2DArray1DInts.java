package com.mr00anderson.arrays.ints;

public class Unsafe2DArray1DInts {
    private int[] array;
    private int rows;
    private int cols;

    public Unsafe2DArray1DInts(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new int[rows * cols];
    }

    public void set(int x, int y, int value) {
        // No bounds checking here, potentially unsafe
        array[x * cols + y] = value;
    }

    public int get(int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[x * cols + y];
    }
}
