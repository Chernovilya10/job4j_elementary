package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class FitnessTest {

    @Test
    public void whenIvan60Nik91() {
        int expected = Fitness.calc(95, 90);
        assertThat(expected, is(0));
    }
    @Test
    public void whenIvan90Nik95() {
        int expected = Fitness.calc(90, 95);
        assertThat(expected, is(1));
    }
    @Test
    public void whenIvan50Nik90() {
        int expected = Fitness.calc(50, 90);
        assertThat(expected, is(2));
    }
}