package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    public static void main(String[] args) {
        double ab = 0.0;
        double ac = 2.0;
        double bc = 2.0;
        System.out.println("Существование возможно = " + exist(ab, ac, bc));
    }
}
