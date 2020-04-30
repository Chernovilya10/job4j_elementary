package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int in = 5;
        int out = 120;
        int expected = Factorial.calc(in);
        assertThat(out, is(120));
    }
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int out = 1;
        int expected = Factorial.calc(in);
        assertThat(out, is(1));
    }
    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int in = 1;
        int out = 1;
        int expected = Factorial.calc(in);
        assertThat(out, is(1));
    }
    @Test
    public void whenCalculateFactorialForMinusTenThenZero() {
        int in = -10;
        int out = 0;
        int expected = Factorial.calc(in);
        assertThat(out, is(0));
    }

}