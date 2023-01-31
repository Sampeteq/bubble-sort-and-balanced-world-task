package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BalancedWordsCounterTest {
    private final BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();

    @Test
    public void testCount_Input_aabbabcccba_Result_28() {
        //given
        String input = "aabbabcccba";
        int expected = 28;

        //when
        assertEquals(expected, balancedWordsCounter.count(input));
    }

    @Test
    public void testCount_Input_empty_Result_0() {
        //given
        String input = "";
        int expected = 0;

        //when
        assertEquals(expected, balancedWordsCounter.count(input));
    }

    @Test
    public void testCount_Input_abababa1_Result_RuntimeException() {
        //given
        String input = "abababa1";

        //when
        assertThrows(IllegalArgumentException.class, () -> balancedWordsCounter.count(input));
    }

    @Test
    public void testCount_Input_null_Result_RuntimeException() {
        //given
        String input = null;

        //when
        assertThrows(IllegalArgumentException.class, () -> balancedWordsCounter.count(input));
    }
}
