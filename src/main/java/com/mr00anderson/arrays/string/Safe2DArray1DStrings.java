package com.mr00anderson.arrays.string;

public class Safe2DArray1DStrings {
    private String[] array;
    private int rows;
    private int cols;

    public Safe2DArray1DStrings(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new String[rows * cols];
    }

    public void set(int x, int y, String value) {
        if (x >= 0 && x < rows && y >= 0 && y < cols) {
            array[x * cols + y] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public String get(int x, int y) {
        if (x >= 0 && x < rows && y >= 0 && y < cols) {
            return array[x * cols + y];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
