package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.SortSelected;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort1() {
        int[] input = new int[] {3, 1, 4, 2, 0};
        int[] expect = new int[] {0, 1, 2, 3, 4};
        int[] result = SortSelected.sort(input);
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort2() {
        int[] input = new int[] {-4, -89, 34};
        int[] expect = new int[] {-89, -4, 34};
        int[] result = SortSelected.sort(input);
        assertThat(result, is(expect));
    }
}