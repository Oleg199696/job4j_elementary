package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float rubleToEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(rubleToEuro);
        float eps = 0.0001f;
        Assert.assertEquals(expectedEuro, outEuro, eps);
    }

    @Test
    public void whenConvert240RblThen4Euro() {
        float rubleToDollar = 240;
        float expectedDollar = 4;
        float outDollar = Converter.rubleToDollar(rubleToDollar);
        float eps = 0.0001f;
        Assert.assertEquals(expectedDollar, outDollar, eps);
    }

}