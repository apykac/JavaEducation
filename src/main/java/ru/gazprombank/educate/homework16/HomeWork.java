package ru.gazprombank.educate.homework16;

import org.jetbrains.annotations.NotNull;

public class HomeWork {

    public static void main(String[] args) {


    }

    public static @NotNull
    String starKill(@NotNull String str) {
        boolean thirdChart = false;
        boolean thirdFromEnd = false;
        if (str.charAt(2) == '*') thirdChart = true;
        if (str.charAt(str.length() - 2) == '*') thirdFromEnd = true;

        int[] array = new int[str.length()];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                array[j] = i;
                j++;
            }
        }

        for (int value : array) {
            str = str.replace(str.charAt(value + 1), '*').replace(str.charAt(value - 1), '*').replace(str.charAt(value), '*');
        }
        return str.replace("*", "");

    }

}
