package com.svetlicic.filip;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utilities;

    @org.junit.Before
    public void setup(){
        utilities = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        assertArrayEquals(new char[]{'e', 'l'}, utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2));
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 7));
    }

    @org.junit.Test
    public void removePairs() {
        String noPairs = utilities.removePairs("AABCDDEFF");
        assertEquals("ABCDEF", noPairs);
        assertNull(utilities.removePairs(null));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter() {
        utilities.converter(10, 0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNull(utilities.nullIfOddLength("Filip"));
        assertEquals("Filipi", utilities.nullIfOddLength("Filipi"));
    }

}