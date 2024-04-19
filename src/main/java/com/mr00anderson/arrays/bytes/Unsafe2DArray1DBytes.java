package com.mr00anderson.arrays.bytes;

public class Unsafe2DArray1DBytes {
    private byte[] array;
    private int rows;
    private int cols;

    public Unsafe2DArray1DBytes(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new byte[rows * cols];
    }

    public void set(int x, int y, byte value) {
        // No bounds checking here, potentially unsafe
        array[x * cols + y] = value;
    }

    public byte get(int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[x * cols + y];
    }
}
