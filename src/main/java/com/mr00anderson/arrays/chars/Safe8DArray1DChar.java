package com.mr00anderson.arrays.chars;

public class Safe8DArray1DChar {
    private char[] array;
    private int dim1, dim2, dim3, dim4, dim5, dim6, dim7, dim8;

    public Safe8DArray1DChar(int dim1, int dim2, int dim3, int dim4, int dim5, int dim6, int dim7, int dim8) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
        this.dim4 = dim4;
        this.dim5 = dim5;
        this.dim6 = dim6;
        this.dim7 = dim7;
        this.dim8 = dim8;
        this.array = new char[dim1 * dim2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8];
    }

    public void set(int a, int b, int c, int d, int e, int f, int g, int h, char value) {
        if (a >= 0 && a < dim1 && b >= 0 && b < dim2 && c >= 0 && c < dim3 && d >= 0 && d < dim4 &&
            e >= 0 && e < dim5 && f >= 0 && f < dim6 && g >= 0 && g < dim7 && h >= 0 && h < dim8) {
            array[(a * dim2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8) + (b * dim3 * dim4 * dim5 * dim6 * dim7 * dim8) +
                  (c * dim4 * dim5 * dim6 * dim7 * dim8) + (d * dim5 * dim6 * dim7 * dim8) +
                  (e * dim6 * dim7 * dim8) + (f * dim7 * dim8) + (g * dim8) + h] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public char get(int a, int b, int c, int d, int e, int f, int g, int h) {
        if (a >= 0 && a < dim1 && b >= 0 && b < dim2 && c >= 0 && c < dim3 && d >= 0 && d < dim4 &&
            e >= 0 && e < dim5 && f >= 0 && f < dim6 && g >= 0 && g < dim7 && h >= 0 && h < dim8) {
            return array[(a * dim2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8) + (b * dim3 * dim4 * dim5 * dim6 * dim7 * dim8) +
                         (c * dim4 * dim5 * dim6 * dim7 * dim8) + (d * dim5 * dim6 * dim7 * dim8) +
                         (e * dim6 * dim7 * dim8) + (f * dim7 * dim8) + (g * dim8) + h];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
