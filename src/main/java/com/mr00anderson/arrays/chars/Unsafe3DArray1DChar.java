package com.mr00anderson.arrays.chars;

public class Unsafe3DArray1DChar {
    private char[] array;
    private int depth;
    private int rows;
    private int cols;

    public Unsafe3DArray1DChar(int depth, int rows, int cols) {
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.array = new char[depth * rows * cols];
    }

    public void set(int z, int x, int y, char value) {
        // No bounds checking here, potentially unsafe
        array[z * rows * cols + x * cols + y] = value;
    }

    public char get(int z, int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[z * rows * cols + x * cols + y];
    }
}
