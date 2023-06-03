package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float rubleToEuro = 140;
        float expectedEuro = 2;
        float rubleToDollar = 240;
        float expectedDollar = 4;
        float outEuro = rubleToEuro(rubleToEuro);
        float outDollar = rubleToDollar(rubleToDollar);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println(rubleToEuro + " rubles are " + outEuro + ". Test result : " + passedEuro);
        System.out.println(rubleToDollar + " rubles are " + outDollar + ". Test result: " + passedDollar);
    }
}
