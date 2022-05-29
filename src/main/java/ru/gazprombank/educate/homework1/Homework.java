package ru.gazprombank.educate.homework1;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {

        String input = Arrays.toString(args);

        System.out.println(punctuationCount(input));

    }

    public static int punctuationCount(String text) {

        int counter = 0;

        if (text.matches("\\p{Punct}")){
            counter++;
        }

        return counter;

    }

}