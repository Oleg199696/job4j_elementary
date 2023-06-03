package ru.job4j.condition;

public class SqArea {

    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        int p = 5;
        double k = 1.5;
        double result1 = square(p, k);
        System.out.println("p = " + p + " , k = " + k + " , s = " + result1);
    }

}
