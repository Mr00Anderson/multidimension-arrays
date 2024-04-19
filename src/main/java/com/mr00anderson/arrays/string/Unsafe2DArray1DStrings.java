package com.mr00anderson.arrays.string;

public class Unsafe2DArray1DStrings {
    private String[] array;
    private int rows;
    private int cols;

    public Unsafe2DArray1DStrings(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new String[rows * cols];
    }

    public void set(int x, int y, String value) {
        // No bounds checking here, potentially unsafe
        array[x * cols + y] = value;
    }

    public String get(int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[x * cols + y];
    }
}
