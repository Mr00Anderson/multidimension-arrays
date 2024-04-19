package com.mr00anderson.arrays.shorts;

public class Unsafe2DArray1DShorts {
    private short[] array;
    private int rows;
    private int cols;

    public Unsafe2DArray1DShorts(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new short[rows * cols];
    }

    public void set(int x, int y, short value) {
        // No bounds checking here, potentially unsafe
        array[x * cols + y] = value;
    }

    public short get(int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[x * cols + y];
    }
}
