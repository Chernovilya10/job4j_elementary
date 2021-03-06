package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5ThenIndex0() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {5, 10, 15};
        int value = 5;
        int expect = 0;
        int result = findLoop.indexOf(input, value);
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas15ThenIndex2() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {5, 10, 15};
        int value = 15;
        int expect = 2;
        int result = findLoop.indexOf(input, value);
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayNoFoundThenMinus1() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {5, 10, 15};
        int value = 14;
        int expect = -1;
        int result = findLoop.indexOf(input, value);
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayFoundIndex2() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 10;
        int start = 2;
        int finish = 4;
        int expect = 2;
        int result = FindLoop.indexOf(input,  value, start, finish);
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayNotFound() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 11;
        int start = 2;
        int finish = 4;
        int expect = -1;
        int result = FindLoop.indexOf(input,  value, start, finish);
        assertThat(result, is(expect));
    }

}