package com.mr00anderson.arrays.string;

public class Safe3DArray1DStrings {
    private String[] array;
    private int depth;
    private int rows;
    private int cols;

    public Safe3DArray1DStrings(int depth, int rows, int cols) {
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.array = new String[depth * rows * cols];
    }

    public void set(int z, int x, int y, String value) {
        if (z >= 0 && z < depth && x >= 0 && x < rows && y >= 0 && y < cols) {
            array[z * rows * cols + x * cols + y] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public String get(int z, int x, int y) {
        if (z >= 0 && z < depth && x >= 0 && x < rows && y >= 0 && y < cols) {
            return array[z * rows * cols + x * cols + y];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
