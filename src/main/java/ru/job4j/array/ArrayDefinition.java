package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива = " + ages.length);
        String[] surname = new String[100500];
        System.out.println("Размер массива = " + surname.length);
        float[] prices = new float[40];
        System.out.println("Размер массива = " + prices.length);
        String[] names = new String[4];
        names[0] = "Oleg0";
        names[1] = "Oleh1";
        names[2] = "Oleg2";
        names[3] = "Oleg3";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
