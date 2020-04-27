package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();        //если метод, в который мы обращаемся статичный, то можно обойтись без создания объекта
        int result = check.max(5, 4, 2);
        assertThat(result, is(5));
    }
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 9, 11);
        assertThat(result, is(11));
    }
    @Test
    public void whenNotMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 1, 1);
        assertThat(result, is(1));
    }
}