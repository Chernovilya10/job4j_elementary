package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal1() {
        int row = 3;
        char[][] input = new char[][] {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result, is(true));
    }
    @Test
    public void whenHasMonoHorizontal2() {
        int row = 2;
        char[][] input = new char[][] {
                {'X', ' '},
                {' ', 'X'},
        };
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result, is(false));
    }
    @Test
    public void whenHasMonoHorizontal3() {
        int row = 3;
        char[][] input = new char[][] {
                {'X', ' ', ' '},
                {' ', 'X', 'X'},
                {'X', 'X', 'X'}
        };
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result, is(true));
    }

}