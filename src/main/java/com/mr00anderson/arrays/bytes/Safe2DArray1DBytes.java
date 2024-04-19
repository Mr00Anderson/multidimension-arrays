package com.mr00anderson.arrays.bytes;

public class Safe2DArray1DBytes {
    private byte[] array;
    private int rows;
    private int cols;

    public Safe2DArray1DBytes(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new byte[rows * cols];
    }

    public void set(int x, int y, byte value) {
        if (x >= 0 && x < rows && y >= 0 && y < cols) {
            array[x * cols + y] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public byte get(int x, int y) {
        if (x >= 0 && x < rows && y >= 0 && y < cols) {
            return array[x * cols + y];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
