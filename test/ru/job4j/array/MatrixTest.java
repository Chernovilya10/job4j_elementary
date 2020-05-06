package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void when2on2() {
        int size = 2;
        int[][] result = Matrix.multiple(size);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(result, is(expect));
    }
    @Test
    public void when4on4() {
        int size = 4;
        int[][] result = Matrix.multiple(size);
        int[][] expect = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16}
        };
        assertThat(result, is(expect));
    }
}