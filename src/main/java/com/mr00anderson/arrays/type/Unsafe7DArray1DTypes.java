package com.mr00anderson.arrays.type;

import java.lang.reflect.Array;

public class Unsafe7DArray1DTypes<T> {
    private T[] array;
    private int dimension1;
    private int dimension2;
    private int dimension3;
    private int dimension4;
    private int dimension5;
    private int dimension6;
    private int dimension7;

    public Unsafe7DArray1DTypes(Class<T> clazz, int dimension1, int dimension2, int dimension3, int dimension4, int dimension5, int dimension6, int dimension7) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
        this.dimension3 = dimension3;
        this.dimension4 = dimension4;
        this.dimension5 = dimension5;
        this.dimension6 = dimension6;
        this.dimension7 = dimension7;
        this.array = (T[]) Array.newInstance(clazz, dimension1 * dimension2 * dimension3 * dimension4 * dimension5 * dimension6 * dimension7);
    }

    public void set(int i1, int i2, int i3, int i4, int i5, int i6, int i7, T value) {
        int index = i1 * dimension2 * dimension3 * dimension4 * dimension5 * dimension6 * dimension7 +
                    i2 * dimension3 * dimension4 * dimension5 * dimension6 * dimension7 +
                    i3 * dimension4 * dimension5 * dimension6 * dimension7 +
                    i4 * dimension5 * dimension6 * dimension7 +
                    i5 * dimension6 * dimension7 +
                    i6 * dimension7 +
                    i7;
        array[index] = value;
    }

    public T get(int i1, int i2, int i3, int i4, int i5, int i6, int i7) {
        int index = i1 * dimension2 * dimension3 * dimension4 * dimension5 * dimension6 * dimension7 +
                    i2 * dimension3 * dimension4 * dimension5 * dimension6 * dimension7 +
                    i3 * dimension4 * dimension5 * dimension6 * dimension7 +
                    i4 * dimension5 * dimension6 * dimension7 +
                    i5 * dimension6 * dimension7 +
                    i6 * dimension7 +
                    i7;
        return array[index];
    }
}
