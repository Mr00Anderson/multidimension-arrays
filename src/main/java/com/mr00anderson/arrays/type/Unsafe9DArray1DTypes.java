package com.mr00anderson.arrays.type;

import java.lang.reflect.Array;

public class Unsafe9DArray1DTypes<T> {
    private T[] array;
    private int dim1, dim2, dim3, dim4, dim5, dim6, dim7, dim8, dim9;

    public Unsafe9DArray1DTypes(Class<T> clazz, int dim1, int dim2, int dim3, int dim4, int dim5, int dim6, int dim7, int dim8, int dim9) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
        this.dim4 = dim4;
        this.dim5 = dim5;
        this.dim6 = dim6;
        this.dim7 = dim7;
        this.dim8 = dim8;
        this.dim9 = dim9;
        this.array = (T[]) Array.newInstance(clazz, dim1 * dim2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9);
    }

    public void set(int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, T value) {
        int index = i1 * dim2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9 +
                    i2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9 +
                    i3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9 +
                    i4 * dim5 * dim6 * dim7 * dim8 * dim9 +
                    i5 * dim6 * dim7 * dim8 * dim9 +
                    i6 * dim7 * dim8 * dim9 +
                    i7 * dim8 * dim9 +
                    i8 * dim9 +
                    i9;
        array[index] = value;
    }

    public T get(int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int index = i1 * dim2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9 +
                    i2 * dim3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9 +
                    i3 * dim4 * dim5 * dim6 * dim7 * dim8 * dim9 +
                    i4 * dim5 * dim6 * dim7 * dim8 * dim9 +
                    i5 * dim6 * dim7 * dim8 * dim9 +
                    i6 * dim7 * dim8 * dim9 +
                    i7 * dim8 * dim9 +
                    i8 * dim9 +
                    i9;
        return array[index];
    }
}
