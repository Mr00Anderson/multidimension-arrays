package com.mr00anderson.arrays.bytes;

public class Safe7DArray1DBytes {
    private byte[] array;
    private int dimension1;
    private int dimension2;
    private int dimension3;
    private int dimension4;
    private int dimension5;
    private int dimension6;
    private int dimension7;

    public Safe7DArray1DBytes(int dimension1, int dimension2, int dimension3, int dimension4, int dimension5, int dimension6, int dimension7) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
        this.dimension3 = dimension3;
        this.dimension4 = dimension4;
        this.dimension5 = dimension5;
        this.dimension6 = dimension6;
        this.dimension7 = dimension7;
        this.array = new byte[dimension1 * dimension2 * dimension3 * dimension4 * dimension5 * dimension6 * dimension7];
    }

    public void set(int i, int j, int k, int l, int m, int n, int o, byte value) {
        if (i >= 0 && i < dimension1 && j >= 0 && j < dimension2 && k >= 0 && k < dimension3 && l >= 0 && l < dimension4 &&
            m >= 0 && m < dimension5 && n >= 0 && n < dimension6 && o >= 0 && o < dimension7) {
            array[(i * dimension2 * dimension3 * dimension4 * dimension5 * dimension6 * dimension7) + 
                  (j * dimension3 * dimension4 * dimension5 * dimension6 * dimension7) + 
                  (k * dimension4 * dimension5 * dimension6 * dimension7) + 
                  (l * dimension5 * dimension6 * dimension7) + 
                  (m * dimension6 * dimension7) + 
                  (n * dimension7) + 
                  o] = value;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public byte get(int i, int j, int k, int l, int m, int n, int o) {
        if (i >= 0 && i < dimension1 && j >= 0 && j < dimension2 && k >= 0 && k < dimension3 && l >= 0 && l < dimension4 &&
            m >= 0 && m < dimension5 && n >= 0 && n < dimension6 && o >= 0 && o < dimension7) {
            return array[(i * dimension2 * dimension3 * dimension4 * dimension5 * dimension6 * dimension7) + 
                         (j * dimension3 * dimension4 * dimension5 * dimension6 * dimension7) + 
                         (k * dimension4 * dimension5 * dimension6 * dimension7) + 
                         (l * dimension5 * dimension6 * dimension7) + 
                         (m * dimension6 * dimension7) + 
                         (n * dimension7) + 
                         o];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}
