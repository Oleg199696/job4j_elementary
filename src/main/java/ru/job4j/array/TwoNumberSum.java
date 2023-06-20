package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                return new int[] {i, j};
            } else {
                if (array[i] + array[j] < target) {
                    i++;
                } else {
                    j--;
                }
            }
        }
            return new int[0];
    }

    public static void main(String[] args) {
        int[] result = getIndexes(new int[] {0, 2, 5, 8, 10, 12}, 15);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
