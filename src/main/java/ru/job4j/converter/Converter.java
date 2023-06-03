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
        float rubleToDollar = 240;
        float euro = rubleToEuro(rubleToEuro);
        float dollar = rubleToDollar(rubleToDollar);
        System.out.println(rubleToEuro + " rubles are " + euro + " euro.");
        System.out.println(rubleToDollar + " rubles are " + dollar + " dollar.");
    }
}
