package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        value = value / 70;
        return value;
    }

    public static float rubleToDollar(float value) {
        value = value / 60;
        return value;
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
