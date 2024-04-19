package com.mr00anderson.arrays.shorts;

public class Unsafe8DArray1DShorts {
    private short[] array;
    private int dim1, dim2, dim3, dim4, dim5, dim6, dim7, dim8;

    public Unsafe8DArray1DShorts(int dim1, int dim2, int dim3, int dim4, int dim5, int dim6, int dim7, int dim8) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
        this.dim4 = dim4;
        this.dim5 = dim5;
        this.dim6 = dim6;
        this.dim7 = dim7;
        this.dim8 = dim8;
        this.array = new short[dim1 * dim2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8];
    }

    public void set(int a, int b, int c, int d, int e, int f, int g, int h, short value) {
        // No bounds checking here, potentially unsafe
        array[(a * dim2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8) + (b * dim3 * dim4 * dim5 * dim6 * dim7 * dim8) +
              (c * dim4 * dim5 * dim6 * dim7 * dim8) + (d * dim5 * dim6 * dim7 * dim8) +
              (e * dim6 * dim7 * dim8) + (f * dim7 * dim8) + (g * dim8) + h] = value;
    }

    public short get(int a, int b, int c, int d, int e, int f, int g, int h) {
        // No bounds checking here, potentially unsafe
        return array[(a * dim2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8) + (b * dim3 * dim4 * dim5 * dim6 * dim7 * dim8) +
                     (c * dim4 * dim5 * dim6 * dim7 * dim8) + (d * dim5 * dim6 * dim7 * dim8) +
                     (e * dim6 * dim7 * dim8) + (f * dim7 * dim8) + (g * dim8) + h];
    }
}
