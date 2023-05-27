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
        float euro = rubleToEuro(140);
        float dollar = rubleToDollar(240);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("240 rubles are " + dollar + " dollar");
    }
}
