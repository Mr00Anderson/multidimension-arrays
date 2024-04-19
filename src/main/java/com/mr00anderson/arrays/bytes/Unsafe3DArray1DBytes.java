package com.mr00anderson.arrays.bytes;

public class Unsafe3DArray1DBytes {
    private byte[] array;
    private int depth;
    private int rows;
    private int cols;

    public Unsafe3DArray1DBytes(int depth, int rows, int cols) {
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.array = new byte[depth * rows * cols];
    }

    public void set(int z, int x, int y, byte value) {
        // No bounds checking here, potentially unsafe
        array[z * rows * cols + x * cols + y] = value;
    }

    public byte get(int z, int x, int y) {
        // No bounds checking here, potentially unsafe
        return array[z * rows * cols + x * cols + y];
    }
}
