package com.mr00anderson.arrays.ints;

public class Unsafe3DArray1DInts {
    private int[] array;
    private int depth;
    private int rows;
    private int cols;

    public Unsafe3DArray1DInts(int depth, int rows, int cols) {
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.array = new int[depth * rows * cols];
    }

    public void set(int z, int x, int y, int value) {
        // No bounds checking here, potentially unsafe
        array[z * rows * cols + x * cols + y] = value;
    }

    public int get(int z, int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[z * rows * cols + x * cols + y];
    }
}
