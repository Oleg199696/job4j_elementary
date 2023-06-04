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
        System.out.println("Число четное = " + LogicNot.isEven(num));
        System.out.println("Число положительное = " + LogicNot.isPositive(num));
        System.out.println("Число нечетное = " + LogicNot.notEven(num));
        System.out.println("Число не положительное = " + LogicNot.notPositive(num));
        System.out.println("Число нечетное и положительное = " + LogicNot.notEvenAndPositive(num));
        System.out.println("Число четное или не положительное = " + LogicNot.evenOrNotPositive(num));
    }

}