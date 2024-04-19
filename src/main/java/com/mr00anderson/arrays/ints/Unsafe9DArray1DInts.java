package com.mr00anderson.arrays.ints;

public class Unsafe9DArray1DInts {
    private int[] array;
    private int dim1, dim2, dim3, dim4, dim5, dim6, dim7, dim8, dim9;

    public Unsafe9DArray1DInts(int dim1, int dim2, int dim3, int dim4, int dim5, int dim6, int dim7, int dim8, int dim9) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
        this.dim4 = dim4;
        this.dim5 = dim5;
        this.dim6 = dim6;
        this.dim7 = dim7;
        this.dim8 = dim8;
        this.dim9 = dim9;
        this.array = new int[dim1 * dim2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9];
    }

    public void set(int a, int b, int c, int d, int e, int f, int g, int h, int i, int value) {
        // No bounds checking here, potentially unsafe
        array[(a * dim2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9) +
              (b * dim3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9) +
              (c * dim4 * dim5 * dim6 * dim7 * dim8 * dim9) +
              (d * dim5 * dim6 * dim7 * dim8 * dim9) +
              (e * dim6 * dim7 * dim8 * dim9) +
              (f * dim7 * dim8 * dim9) +
              (g * dim8 * dim9) +
              (h * dim9) + i] = value;
    }

    public int get(int a, int b, int c, int d, int e, int f, int g, int h, int i) {
        // No bounds checking here, potentially unsafe
        return array[(a * dim2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9) +
                     (b * dim3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9) +
                     (c * dim4 * dim5 * dim6 * dim7 * dim8 * dim9) +
                     (d * dim5 * dim6 * dim7 * dim8 * dim9) +
                     (e * dim6 * dim7 * dim8 * dim9) +
                     (f * dim7 * dim8 * dim9) +
                     (g * dim8 * dim9) +
                     (h * dim9) + i];
    }
}
