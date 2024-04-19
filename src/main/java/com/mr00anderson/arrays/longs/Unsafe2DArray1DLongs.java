package com.mr00anderson.arrays.longs;

public class Unsafe2DArray1DLongs {
    private long[] array;
    private int rows;
    private int cols;

    public Unsafe2DArray1DLongs(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new long[rows * cols];
    }

    public void set(int x, int y, long value) {
        // No bounds checking here, potentially unsafe
        array[x * cols + y] = value;
    }

    public long get(int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[x * cols + y];
    }
}
