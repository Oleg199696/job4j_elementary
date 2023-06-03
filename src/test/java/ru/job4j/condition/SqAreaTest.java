package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2ThenS2() {
        int p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP44K10ThenS40() {
        int p = 44;
        double k = 10;
        double expected = 40;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K15ThenS15() {
        int p = 5;
        double k = 1.5;
        double expected = 1.5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K0ThenS0() {
        int p = 5;
        double k = 0;
        double expected = 0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

}