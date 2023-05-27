package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int x2, int y1, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 3;
        int y1 = 8;
        int y2 = 13;
        double result = Point.distance(x1, x2, y1, y2);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
