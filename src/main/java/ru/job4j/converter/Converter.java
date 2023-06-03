package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float rubleToEuro = 0;
        float expectedEuro = 2;
        float rubleToDollar = 240;
        float expectedDollar = 4;
        float outEuro = rubleToEuro(rubleToEuro);
        float outDollar = rubleToDollar(rubleToDollar);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println(rubleToEuro + " rubles are " + expectedEuro + ". Test result : " + passedEuro);
        System.out.println(rubleToDollar + " rubles are " + expectedDollar + ". Test result: " + passedDollar);
    }
}
