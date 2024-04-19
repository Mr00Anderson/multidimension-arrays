package com.mr00anderson.arrays.ints;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Combined8DArrayTests {

    @Test
    public void testSafeSetAndGet() {
        Safe8DArray1DInts safeArray = new Safe8DArray1DInts(2, 2, 2, 2, 2, 2, 2, 2);
        safeArray.set(1, 1, 1, 1, 1, 1, 1, 1, 999);
        Assertions.assertEquals(999, safeArray.get(1, 1, 1, 1, 1, 1, 1, 1), "Value at the last index should be 999 in safe array");
    }

    @Test
    public void testUnsafeSetAndGet() {
        Unsafe8DArray1DInts unsafeArray = new Unsafe8DArray1DInts(2, 2, 2, 2, 2, 2, 2, 2);
        unsafeArray.set(1, 1, 1, 1, 1, 1, 1, 1, 888);
        Assertions.assertEquals(888, unsafeArray.get(1, 1, 1, 1, 1, 1, 1, 1), "Value at the last index should be 888 in unsafe array");
    }

    @Test
    public void testSafeOutOfBoundsSet() {
        Safe8DArray1DInts safeArray = new Safe8DArray1DInts(2, 2, 2, 2, 2, 2, 2, 2);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            safeArray.set(3, 2, 2, 2, 2, 2, 2, 2, 123);  // This should throw IndexOutOfBoundsException
        });
    }

    @Test
    public void testUnsafeOutOfBoundsAccess() {
        Unsafe8DArray1DInts unsafeArray = new Unsafe8DArray1DInts(2, 2, 2, 2, 2, 2, 2, 2);
        // Unsafe array might not handle bounds and could throw an uncaught ArrayIndexOutOfBoundsException
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            unsafeArray.set(3, 2, 2, 2, 2, 2, 2, 2, 123);  // Expecting a possible unhandled exception
        });
    }
}
