package com.telran.base.lesson12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExampleTest {

    @Test
    public void testGetMaxWhenArrayIsCorrect() {
        ArrayExample arrayExample = new ArrayExample();
        int[] ints = {1, 2, 3};
        assertEquals(3, arrayExample.getMax(ints));
    }

    @Test
    public void testGetMaxWhenArrayIsNull() {
        ArrayExample arrayExample = new ArrayExample();
        int[] ints = null;
        assertEquals(-1, arrayExample.getMax(ints));
    }

    @Test
    public void testGetMaxWhenArrayIsEmpty() {
        ArrayExample arrayExample = new ArrayExample();
        int[] ints = {};
        assertEquals(-1, arrayExample.getMax(ints));
    }

}