package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
   public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int expected = 2;
        int result = Max.max(first, second);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int first = 2;
        int second = 1;
        int expected = 2;
        int result = Max.max(first, second);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int first = 2;
        int second = 2;
        int expected = 2;
        int result = Max.max(first, second);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To3Then4() {
        int first = 2;
        int second = 2;
        int third = 4;
        int expected = 4;
        int result = Max.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To1Then10() {
        int first = 10;
        int second = 0;
        int third = -567;
        int expected = 10;
        int result = Max.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax0To1Then0() {
        int first = 0;
        int second = 0;
        int third = 0;
        int expected = 0;
        int result = Max.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax0To1Then1() {
        int first = 0;
        int second = -1;
        int third = -1;
        int expected = 0;
        int result = Max.max(first, second, third);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMaxMinus10To4ThenMinus10() {
        int first = -11;
        int second = -11;
        int third = -11;
        int fourth = -10;
        int expected = -10;
        int result = Max.max(first, second, third, fourth);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To1Then1() {
        int first = 1;
        int second = 1;
        int third = 1;
        int fourth = 1;
        int expected = 1;
        int result = Max.max(first, second, third, fourth);
        assertThat(result).isEqualTo(expected);
    }
}