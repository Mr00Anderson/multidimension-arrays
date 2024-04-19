package com.mr00anderson.arrays.chars;

public class Unsafe2DArray1DChar {
    private char[] array;
    private int rows;
    private int cols;

    public Unsafe2DArray1DChar(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new char[rows * cols];
    }

    public void set(int x, int y, char value) {
        // No bounds checking here, potentially unsafe
        array[x * cols + y] = value;
    }

    public char get(int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[x * cols + y];
    }
}
