package com.mr00anderson.arrays.bytes;

public class Safe3DArray1DBytes {
    private byte[] array;
    private int depth;
    private int rows;
    private int cols;

    public Safe3DArray1DBytes(int depth, int rows, int cols) {
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.array = new byte[depth * rows * cols];
    }

    public void set(int z, int x, int y, byte value) {
        if (z >= 0 && z < depth && x >= 0 && x < rows && y >= 0 && y < cols) {
            array[z * rows * cols + x * cols + y] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public byte get(int z, int x, int y) {
        if (z >= 0 && z < depth && x >= 0 && x < rows && y >= 0 && y < cols) {
            return array[z * rows * cols + x * cols + y];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
