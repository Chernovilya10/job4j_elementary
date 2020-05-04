package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] expect = new int[] {4, 2, 3, 1};
        int[] result = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(result, is(expect));
    }
    @Test
    public void whenSwap1to3() {
        int[] input = new int[] {8, 6, 8, 9, 8};
        int[] expect = new int[] {8, 9, 8, 6, 8};
        int[] result = SwitchArray.swap(input, 1, 3);
        assertThat(result, is(expect));
    }
}