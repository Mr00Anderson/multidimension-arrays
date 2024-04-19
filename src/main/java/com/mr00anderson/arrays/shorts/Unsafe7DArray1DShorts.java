package com.mr00anderson.arrays.shorts;

public class Unsafe7DArray1DShorts {
    private short[] array;
    private int dimension1;
    private int dimension2;
    private int dimension3;
    private int dimension4;
    private int dimension5;
    private int dimension6;
    private int dimension7;

    public Unsafe7DArray1DShorts(int dimension1, int dimension2, int dimension3, int dimension4, int dimension5, int dimension6, int dimension7) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
        this.dimension3 = dimension3;
        this.dimension4 = dimension4;
        this.dimension5 = dimension5;
        this.dimension6 = dimension6;
        this.dimension7 = dimension7;
        this.array = new short[dimension1 * dimension2 * dimension3 * dimension4 * dimension5 * dimension6 * dimension7];
    }

    public void set(int i, int j, int k, int l, int m, int n, int o, short value) {
        // No bounds checking here, potentially unsafe
        array[(i * dimension2 * dimension3 * dimension4 * dimension5 * dimension6 * dimension7) + 
              (j * dimension3 * dimension4 * dimension5 * dimension6 * dimension7) + 
              (k * dimension4 * dimension5 * dimension6 * dimension7) + 
              (l * dimension5 * dimension6 * dimension7) + 
              (m * dimension6 * dimension7) + 
              (n * dimension7) + 
              o] = value;
    }

    public short get(int i, int j, int k, int l, int m, int n, int o) {
        // No bounds checking here, potentially unsafe
        return array[(i * dimension2 * dimension3 * dimension4 * dimension5 * dimension6 * dimension7) + 
                     (j * dimension3 * dimension4 * dimension5 * dimension6 * dimension7) + 
                     (k * dimension4 * dimension5 * dimension6 * dimension7) + 
                     (l * dimension5 * dimension6 * dimension7) + 
                     (m * dimension6 * dimension7) + 
                     (n * dimension7) + 
                     o];
    }
}
