package com.mr00anderson.arrays.shorts;

public class Safe10DArray1DShorts {
    private short[] array;
    private int dim1, dim2, dim3, dim4, dim5, dim6, dim7, dim8, dim9, dim10;

    public Safe10DArray1DShorts(int dim1, int dim2, int dim3, int dim4, int dim5, int dim6, int dim7, int dim8, int dim9, int dim10) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
        this.dim4 = dim4;
        this.dim5 = dim5;
        this.dim6 = dim6;
        this.dim7 = dim7;
        this.dim8 = dim8;
        this.dim9 = dim9;
        this.dim10 = dim10;
        this.array = new short[dim1 * dim2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9 * dim10];
    }

    public void set(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, short value) {
        if (a >= 0 && a < dim1 && b >= 0 && b < dim2 && c >= 0 && c < dim3 && d >= 0 && d < dim4 &&
            e >= 0 && e < dim5 && f >= 0 && f < dim6 && g >= 0 && g < dim7 && h >= 0 && h < dim8 && 
            i >= 0 && i < dim9 && j >= 0 && j < dim10) {
            array[(a * dim2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9 * dim10) +
                  (b * dim3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9 * dim10) +
                  (c * dim4 * dim5 * dim6 * dim7 * dim8 * dim9 * dim10) +
                  (d * dim5 * dim6 * dim7 * dim8 * dim9 * dim10) +
                  (e * dim6 * dim7 * dim8 * dim9 * dim10) +
                  (f * dim7 * dim8 * dim9 * dim10) +
                  (g * dim8 * dim9 * dim10) +
                  (h * dim9 * dim10) +
                  (i * dim10) + j] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public short get(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        if (a >= 0 && a < dim1 && b >= 0 && b < dim2 && c >= 0 && c < dim3 && d >= 0 && d < dim4 &&
            e >= 0 && e < dim5 && f >= 0 && f < dim6 && g >= 0 && g < dim7 && h >= 0 && h < dim8 && 
            i >= 0 && i < dim9 && j >= 0 && j < dim10) {
            return array[(a * dim2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9 * dim10) +
                         (b * dim3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9 * dim10) +
                         (c * dim4 * dim5 * dim6 * dim7 * dim8 * dim9 * dim10) +
                         (d * dim5 * dim6 * dim7 * dim8 * dim9 * dim10) +
                         (e * dim6 * dim7 * dim8 * dim9 * dim10) +
                         (f * dim7 * dim8 * dim9 * dim10) +
                         (g * dim8 * dim9 * dim10) +
                         (h * dim9 * dim10) +
                         (i * dim10) + j];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
