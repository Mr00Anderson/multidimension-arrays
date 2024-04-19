package com.mr00anderson.arrays.ints;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Combined1DArrayTests {

    @Test
    public void testSafeSetAndGet() {
        Safe1DArrayInts safeArray = new Safe1DArrayInts(2);
        safeArray.set(1, 999);
        Assertions.assertEquals(999, safeArray.get(1), "Value at index 1 should be 999 in safe array");
    }

    @Test
    public void testUnsafeSetAndGet() {
        Unsafe1DArrayInts unsafeArray = new Unsafe1DArrayInts(2);
        unsafeArray.set(1, 888);
        Assertions.assertEquals(888, unsafeArray.get(1), "Value at index 1 should be 888 in unsafe array");
    }

    @Test
    public void testSafeOutOfBoundsSet() {
        Safe1DArrayInts safeArray = new Safe1DArrayInts(2);
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            safeArray.set(2, 123);  // This should throw IndexOutOfBoundsException
        });
    }

    @Test
    public void testUnsafeOutOfBoundsSet() {
        Unsafe1DArrayInts unsafeArray = new Unsafe1DArrayInts(2);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            unsafeArray.set(2, 123);  // This is expected to throw ArrayIndexOutOfBoundsException due to no bounds checking
        });
    }

    @Test
    public void testUnsafeOutOfBoundsGet() {
        Unsafe1DArrayInts unsafeArray = new Unsafe1DArrayInts(2);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int value = unsafeArray.get(2);  // This is expected to throw ArrayIndexOutOfBoundsException due to no bounds checking
        });
    }
}
