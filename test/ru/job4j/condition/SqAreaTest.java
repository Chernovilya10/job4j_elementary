package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenPTo16KTo3ThenSTo12() {
        int inP = 16;
        int inK = 3;
        double expected = 12;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }
}