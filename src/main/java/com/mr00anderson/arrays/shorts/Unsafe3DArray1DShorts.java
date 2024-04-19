package com.mr00anderson.arrays.shorts;

public class Unsafe3DArray1DShorts {
    private short[] array;
    private int depth;
    private int rows;
    private int cols;

    public Unsafe3DArray1DShorts(int depth, int rows, int cols) {
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.array = new short[depth * rows * cols];
    }

    public void set(int z, int x, int y, short value) {
        // No bounds checking here, potentially unsafe
        array[z * rows * cols + x * cols + y] = value;
    }

    public short get(int z, int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[z * rows * cols + x * cols + y];
    }
}
