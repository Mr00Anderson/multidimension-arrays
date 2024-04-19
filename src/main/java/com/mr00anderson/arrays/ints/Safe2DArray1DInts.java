package com.mr00anderson.arrays.ints;

public class Safe2DArray1DInts {
    private int[] array;
    private int rows;
    private int cols;

    public Safe2DArray1DInts(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new int[rows * cols];
    }

    public void set(int x, int y, int value) {
        if (x >= 0 && x < rows && y >= 0 && y < cols) {
            array[x * cols + y] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public int get(int x, int y) {
        if (x >= 0 && x < rows && y >= 0 && y < cols) {
            return array[x * cols + y];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
