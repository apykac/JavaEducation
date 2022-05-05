package ru.gazprombank.educate.homework1;

public class Homework {

    public static int punctuationCount(String string) {
        String symbols = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

        int i = 0;
        for (char stringCh : string.toCharArray()) {
            for (char symbol : symbols.toCharArray()) {
                if (stringCh == symbol)
                    i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {

    }
}
