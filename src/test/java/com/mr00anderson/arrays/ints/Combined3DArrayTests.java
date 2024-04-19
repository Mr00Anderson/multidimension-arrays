package com.mr00anderson.arrays.ints;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Combined3DArrayTests {

    @Test
    public void testSafeSetAndGet() {
        Safe3DArray1DInts safeArray = new Safe3DArray1DInts(2, 2, 2);
        safeArray.set(1, 1, 1, 999);
        Assertions.assertEquals(999, safeArray.get(1, 1, 1), "Value at the last index should be 999 in safe array");
    }

    @Test
    public void testUnsafeSetAndGet() {
        Unsafe3DArray1DInts unsafeArray = new Unsafe3DArray1DInts(2, 2, 2);
        unsafeArray.set(1, 1, 1, 888);
        Assertions.assertEquals(888, unsafeArray.get(1, 1, 1), "Value at the last index should be 888 in unsafe array");
    }

    @Test
    public void testSafeOutOfBoundsSet() {
        Safe3DArray1DInts safeArray = new Safe3DArray1DInts(2, 2, 2);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            safeArray.set(3, 2, 2, 123);  // This should throw IndexOutOfBoundsException
        });
    }

    @Test
    public void testUnsafeOutOfBoundsAccess() {
        Unsafe3DArray1DInts unsafeArray = new Unsafe3DArray1DInts(2, 2, 2);
        // Unsafe array might not handle bounds and could throw an uncaught ArrayIndexOutOfBoundsException
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            unsafeArray.set(3, 2, 2, 123);  // Expecting a possible unhandled exception
        });
    }
}
