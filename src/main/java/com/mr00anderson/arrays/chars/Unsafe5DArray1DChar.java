package com.mr00anderson.arrays.chars;

public class Unsafe5DArray1DChar {
    private char[] array;
    private int time;
    private int space;
    private int depth;
    private int rows;
    private int cols;

    public Unsafe5DArray1DChar(int time, int space, int depth, int rows, int cols) {
        this.time = time;
        this.space = space;
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.array = new char[time * space * depth * rows * cols];
    }

    public void set(int t, int s, int z, int x, int y, char value) {
        // No bounds checking here, potentially unsafe
        array[(t * space * depth * rows * cols) + (s * depth * rows * cols) + (z * rows * cols) + (x * cols) + y] = value;
    }

    public char get(int t, int s, int z, int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[(t * space * depth * rows * cols) + (s * depth * rows * cols) + (z * rows * cols) + (x * cols) + y];
    }
}
