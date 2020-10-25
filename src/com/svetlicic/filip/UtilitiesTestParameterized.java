package com.svetlicic.filip;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {

    private String in;
    private String out;
    private Utilities utilities;

    public UtilitiesTestParameterized(String in, String out) {
        this.in = in;
        this.out = out;
    }

    @org.junit.Before
    public void setup(){
        utilities = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions(){
        return Arrays.asList(new String[][]{
                {"ABCDEFF", "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A", "A"}
        });
    }

    @org.junit.Test
    public void removePairs() {
        String noPairs = utilities.removePairs(in);
        assertEquals(out, noPairs);
        assertNull(utilities.removePairs(null));
    }
}
