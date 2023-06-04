package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when41to51then5() {
        int x1 = 4;
        int x2 = 1;
        int y1 = 5;
        int y2 = 1;
        double expected = 5;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to11then0() {
        int x1 = 1;
        int x2 = 1;
        int y1 = 1;
        int y2 = 1;
        double expected = 0;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}