package com.mr00anderson.arrays.ints;

public class Safe6DArray1DInts {
    private int[] array;
    private int era;
    private int time;
    private int space;
    private int depth;
    private int rows;
    private int cols;

    public Safe6DArray1DInts(int era, int time, int space, int depth, int rows, int cols) {
        this.era = era;
        this.time = time;
        this.space = space;
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.array = new int[era * time * space * depth * rows * cols];
    }

    public void set(int e, int t, int s, int z, int x, int y, int value) {
        if (e >= 0 && e < era && t >= 0 && t < time && s >= 0 && s < space && z >= 0 && z < depth && x >= 0 && x < rows && y >= 0 && y < cols) {
            array[(e * time * space * depth * rows * cols) + (t * space * depth * rows * cols) + (s * depth * rows * cols) + (z * rows * cols) + (x * cols) + y] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public int get(int e, int t, int s, int z, int x, int y) {
        if (e >= 0 && e < era && t >= 0 && t < time && s >= 0 && s < space && z >= 0 && z < depth && x >= 0 && x < rows && y >= 0 && y < cols) {
            return array[(e * time * space * depth * rows * cols) + (t * space * depth * rows * cols) + (s * depth * rows * cols) + (z * rows * cols) + (x * cols) + y];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}