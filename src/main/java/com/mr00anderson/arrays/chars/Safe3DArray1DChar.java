package com.mr00anderson.arrays.chars;

public class Safe3DArray1DChar {
    private char[] array;
    private int depth;
    private int rows;
    private int cols;

    public Safe3DArray1DChar(int depth, int rows, int cols) {
        this.depth = depth;
        this.rows = rows;
        this.cols = cols;
        this.array = new char[depth * rows * cols];
    }

    public void set(int z, int x, int y, char value) {
        if (z >= 0 && z < depth && x >= 0 && x < rows && y >= 0 && y < cols) {
            array[z * rows * cols + x * cols + y] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public char get(int z, int x, int y) {
        if (z >= 0 && z < depth && x >= 0 && x < rows && y >= 0 && y < cols) {
            return array[z * rows * cols + x * cols + y];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
