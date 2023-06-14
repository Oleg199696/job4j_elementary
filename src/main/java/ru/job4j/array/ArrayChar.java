package ru.job4j.array;

public class ArrayChar {
    
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < word.length; index++) {
            result = word[index] == pref[index];
            if (index == (pref.length - 1)) {
                break;
            }
        }
        return result;
    }
}
