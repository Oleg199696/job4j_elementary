package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        int num = 10;
        boolean result = LogicNot.isEven(num);
        System.out.println("Число четное = " + result);
        result = LogicNot.isPositive(num);
        System.out.println("Число положительное = " + result);
        result = LogicNot.notEven(num);
        System.out.println("Число нечетное = " + result);
        result = LogicNot.notPositive(num);
        System.out.println("Число не положительное = " + result);
        result = LogicNot.notEvenAndPositive(num);
        System.out.println("Число нечетное и положительное = " + result);
        result = LogicNot.evenOrNotPositive(num);
        System.out.println("Число четное или не положительное = " + result);
    }

}