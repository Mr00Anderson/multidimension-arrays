package com.mr00anderson.arrays.longs;

public class Unsafe6DArray1DLongs {
    private long[] array;
    private int era;
    private int time;
    private int space;
    private int depth;
    private int rows;
    private int cols;

    public Unsafe6DArray1DLongs(int era, int time, int space, int depth, int rows, int cols) {
        this.era = era;
        this.time = time;
        this.space = space;
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.array = new long[era * time * space * depth * rows * cols];
    }

    public void set(int e, int t, int s, int z, int x, int y, long value) {
        // No bounds checking here, potentially unsafe
        array[(e * time * space * depth * rows * cols) + (t * space * depth * rows * cols) + (s * depth * rows * cols) + (z * rows * cols) + (x * cols) + y] = value;
    }

    public long get(int e, int t, int s, int z, int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[(e * time * space * depth * rows * cols) + (t * space * depth * rows * cols) + (s * depth * rows * cols) + (z * rows * cols) + (x * cols) + y];
    }
}
