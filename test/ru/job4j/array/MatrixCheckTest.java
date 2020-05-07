package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixCheckTest {

    //Тест на моностроку

    @Test
    public void whenHasMonoHorizontal1() {
        int row = 1;
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
        int row = 0;
        char[][] input = new char[][] {
                {'X', ' '},
                {' ', 'X'},
        };
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result, is(false));
    }
    @Test
    public void whenHasMonoHorizontal3() {
        int row = 2;
        char[][] input = new char[][] {
                {'X', ' ', ' '},
                {' ', 'X', 'X'},
                {'X', 'X', 'X'}
        };
        boolean result = MatrixCheck.monoHorizontal(input, row);
        assertThat(result, is(true));
    }

    //Тест на моностолбец

    @Test
    public void whenHasMonoVertical1() {
        int column = 2;
        char[][] input = new char[][] {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result, is(true));
    }
    @Test
    public void whenHasMonoVertical2() {
        int column = 0;
        char[][] input = new char[][] {
                {'X', ' '},
                {' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result, is(false));
    }
    @Test
    public void whenHasMonoVertical3() {
        int column = 3;
        char[][] input = new char[][] {
                {' ', 'X', 'X', 'X'},
                {'X', ' ', ' ', 'X'},
                {' ', 'X', 'X', 'X'},
                {' ', 'X', 'X', 'X'}
        };
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result, is(true));
    }

    //Тест на заполнение диагонали

    @Test
    public void whenDiagonal1() {
        char[][] input = new char[][] {
                {'X', 'K', 'R', 'Q'},
                {'D', 'R', 'L', 'W'},
                {'P', 'H', 'N', 'E'},
                {'K', 'G', 'X', 'X'}
        };
        char[] rst = MatrixCheck.extraDiagonal(input);
        char[] expect = {'X', 'R', 'N', 'X'};
        assertThat(rst, is(expect));
    }
    @Test
    public void whenDiagonal2() {
        char[][] input = new char[][] {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] rst = MatrixCheck.extraDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(rst, is(expect));
    }

    //Выигышные комбинации в сокобан
    @Test
    public void whenDataMonoByTrueThenTrue1() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenDataNotMonoByTrueThenFalse2() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue3() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }
    @Test
    public void whenDataNotMonoByTrueThenFalse4() {
        char[][] input = {
                {'X', ' ', ' ', 'X', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {'X', ' ', 'X', 'X', ' '},
                {' ', ' ', 'X', ' ', 'X'},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }


}