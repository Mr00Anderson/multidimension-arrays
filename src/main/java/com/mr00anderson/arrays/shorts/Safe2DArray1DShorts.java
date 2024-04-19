package com.mr00anderson.arrays.shorts;

public class Safe2DArray1DShorts {
    private short[] array;
    private int rows;
    private int cols;

    public Safe2DArray1DShorts(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new short[rows * cols];
    }

    public void set(int x, int y, short value) {
        if (x >= 0 && x < rows && y >= 0 && y < cols) {
            array[x * cols + y] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public short get(int x, int y) {
        if (x >= 0 && x < rows && y >= 0 && y < cols) {
            return array[x * cols + y];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
