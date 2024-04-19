package com.mr00anderson.arrays.string;

public class Unsafe3DArray1DStrings {
    private String[] array;
    private int depth;
    private int rows;
    private int cols;

    public Unsafe3DArray1DStrings(int depth, int rows, int cols) {
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.array = new String[depth * rows * cols];
    }

    public void set(int z, int x, int y, String value) {
        // No bounds checking here, potentially unsafe
        array[z * rows * cols + x * cols + y] = value;
    }

    public String get(int z, int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[z * rows * cols + x * cols + y];
    }
}
