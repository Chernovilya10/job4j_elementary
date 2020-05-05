package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void whenFirstMin() {
        assertThat(MinDiapason.minDiapason(new int[] {-1, 0, 5, 10}, 1, 3), is(0));
    }
    @Test
    public void whenLastMin() {
        assertThat(MinDiapason.minDiapason(new int[] {10, 5, 3, 1}, 1, 3), is(1));
    }
    @Test
    public void whenMiddleMin() {
        assertThat(MinDiapason.minDiapason(new int[] {10, 2, 5, 1}, 0, 2), is(2));
    }
    @Test
    public void whenNotMin() {
        assertThat(MinDiapason.minDiapason(new int[] {2, 2, 2, 2}, 0, 2), is(2));
    }
}