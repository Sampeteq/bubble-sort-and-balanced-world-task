package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BubbleSortTest {

    private final BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void should_short_integer_numbers() {
        //given
        var input = List.of(1, 4, 5, 6, 8, 3, 8);
        var result = List.of(1, 3, 4, 5, 6, 8, 8);

        //then
        assertEquals(bubbleSort.sort(input), result);
    }

    @Test
    public void should_short_double_numbers() {
        //given
        var input = List.of(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0);;
        var result = List.of(-9.3, 0.1, 0.2, 4.0, 5.0, 9.0);

        //then
        assertEquals(bubbleSort.sort(input), result);
    }

    @Test
    public void should_return_empty_list_when_input_is_empty_list() {
        //given
        List<Integer> input = List.of();

        //then
        assertTrue(bubbleSort.sort(input).isEmpty());
    }

    @Test
    public void should_input_null_values_be_omitted_during_sorting() {
        //given

        var input = new ArrayList<Double>();
        input.add(null);
        input.add(5.0001);
        var result = List.of(5.0001);

        //then
        assertEquals(bubbleSort.sort(input), result);
    }

    @Test
    public void should_throw_exception_when_input_is_null() {
        //given
        List<Double> input = null;

        //then
        var exception = assertThrows(IllegalArgumentException.class, () -> new BubbleSort().sort(input));
        assertEquals(exception.getMessage(), "An input cannot be null");
    }
}
