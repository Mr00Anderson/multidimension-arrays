package com.mr00anderson.arrays.shorts;

public class Unsafe5DArray1DShorts {
    private short[] array;
    private int time;
    private int space;
    private int depth;
    private int rows;
    private int cols;

    public Unsafe5DArray1DShorts(int time, int space, int depth, int rows, int cols) {
        this.time = time;
        this.space = space;
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.array = new short[time * space * depth * rows * cols];
    }

    public void set(int t, int s, int z, int x, int y, short value) {
        // No bounds checking here, potentially unsafe
        array[(t * space * depth * rows * cols) + (s * depth * rows * cols) + (z * rows * cols) + (x * cols) + y] = value;
    }

    public short get(int t, int s, int z, int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[(t * space * depth * rows * cols) + (s * depth * rows * cols) + (z * rows * cols) + (x * cols) + y];
    }
}
