package com.mr00anderson.arrays.longs;

public class Unsafe3DArray1DLongs {
    private long[] array;
    private int depth;
    private int rows;
    private int cols;

    public Unsafe3DArray1DLongs(int depth, int rows, int cols) {
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.array = new long[depth * rows * cols];
    }

    public void set(int z, int x, int y, long value) {
        // No bounds checking here, potentially unsafe
        array[z * rows * cols + x * cols + y] = value;
    }

    public long get(int z, int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[z * rows * cols + x * cols + y];
    }
}
